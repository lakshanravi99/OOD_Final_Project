package control;

import db.DBConnection;
import model.Admin;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AdminControl {
    public boolean addAdmin(Admin admin) throws SQLException, ClassNotFoundException {
        PreparedStatement ptm = DBConnection.getInstance().getConnection().prepareStatement("INSERT INTO Admin VALUES (? ,? ,? ,? ,?)");
        ptm.setObject(1, admin.getAdmin_id());
        ptm.setObject(2, admin.getAdmin_nic());
        ptm.setObject(3, admin.getAdmin_name());
        ptm.setObject(4, admin.getAdmin_dob());
        ptm.setObject(5, admin.getAdmin_gender());
        return ptm.executeUpdate() > 0;
    }

    public boolean updateAdmin(Admin admin) throws SQLException, ClassNotFoundException {
        PreparedStatement ptm = DBConnection.getInstance().getConnection().prepareStatement("UPDATE Admin SET admin_nic=?,admin_name=?,admin_name=?,admin_dob=?,admin_gender=? WHERE admin_id=?");
        ptm.setObject(1, admin.getAdmin_nic());
        ptm.setObject(2, admin.getAdmin_name());
        ptm.setObject(3, admin.getAdmin_dob());
        ptm.setObject(4, admin.getAdmin_gender());
        ptm.setObject(5, admin.getAdmin_id());
        return ptm.executeUpdate() > 0;
    }

    public boolean deleteAdmin(String id) throws SQLException, ClassNotFoundException {
        PreparedStatement ptm = DBConnection.getInstance().getConnection().prepareStatement("DELETE FROM Admin WHERE admin_id=?");
        ptm.setObject(1, id);
        return ptm.executeUpdate() > 0;
    }

    public Admin searchAdmin(String id) throws SQLException, ClassNotFoundException {
        PreparedStatement ptm = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM Admin WHERE admin_id=?");
        ptm.setObject(1, id);
        ResultSet rst = ptm.executeQuery();
        if (rst.next()) {
            return new Admin(rst.getString(1), rst.getString(2), rst.getString(3), rst.getDate(4), rst.getString(5));
        }
        return null;
    }

    public ArrayList<Admin> getAllAdmin() throws SQLException, ClassNotFoundException {
        PreparedStatement ptm = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM Admin");
        ResultSet rst = ptm.executeQuery();
        ArrayList<Admin> admins = new ArrayList<>();
        while (rst.next()) {
            admins.add(new Admin(rst.getString(1), rst.getString(2), rst.getString(3), rst.getDate(4), rst.getString(5)));
        }
        return admins;
    }
}
