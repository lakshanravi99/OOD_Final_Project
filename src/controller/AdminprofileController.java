
package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import db.DBConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import tm.AdminProfileTM;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdminprofileController implements Initializable {


    @FXML
    private JFXTextField idbox;
    @FXML
    private JFXTextField namebox;
    @FXML
    private JFXButton insertbtn;
    @FXML
    private TableView<AdminProfileTM> tblAdmin;
    @FXML
    private JFXButton updatebtn;
    @FXML
    private JFXButton deletebtn;
    @FXML
    private JFXTextField dobbox;
    @FXML
    private JFXTextField genderbox;
    @FXML
    private JFXTextField nicbox;
    @FXML
    private TableColumn<AdminProfileTM, ?> colNic;
    @FXML
    private TableColumn<AdminProfileTM, ?> colDob;

    @FXML
    private TableColumn<AdminProfileTM, ?> colId;

    @FXML
    private TableColumn<AdminProfileTM, ?> colName;

    @FXML
    private TableColumn<AdminProfileTM, ?> colgender;

    @FXML
    private Label dobbox1;
    @FXML
    private Pane back_pane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            setTableCols();
            loadAllAdminsToTable();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminprofileController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminprofileController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void insertRecord(MouseEvent event) {
        //--------------------
        try {
            Connection con = DBConnection.getInstance().getConnection();
            PreparedStatement stm = con.prepareStatement("INSERT INTO admin VALUES (?,?,?,?,?)");
            stm.setObject(1, idbox.getText());
            stm.setObject(2, nicbox.getText());
            stm.setObject(3, namebox.getText());
            stm.setObject(4, dobbox.getText());
            stm.setObject(5, genderbox.getText());
            boolean isAdded = stm.executeUpdate() > 0;
            if (isAdded) {
                JOptionPane.showMessageDialog(null, "Added sucessfully");
                loadAllAdminsToTable();
            } else {
                JOptionPane.showMessageDialog(null, "NOT Added");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminprofileController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminprofileController.class.getName()).log(Level.SEVERE, null, ex);
        }
        //--------------------
    }

    @FXML
    private void updateRecord(MouseEvent event) {

        try {
            Connection con = DBConnection.getInstance().getConnection();
            PreparedStatement stm = con.prepareStatement("UPDATE admin SET admin_name=?,admin_nic=?,admin_dob=?,admin_gender=? where admin_id=? ");
            stm.setObject(1, namebox.getText());
            stm.setObject(2, nicbox.getText());
            stm.setObject(3, dobbox.getText());
            stm.setObject(4, genderbox.getText());
            stm.setObject(5, idbox.getText());

            //stm.setObject(4, genderbox.getText());

            boolean isAdded = stm.executeUpdate() > 0;
            if (isAdded) {
                JOptionPane.showMessageDialog(null, "Update sucessfully");
                loadAllAdminsToTable();
            } else {
                JOptionPane.showMessageDialog(null, "NOT Updated");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminprofileController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminprofileController.class.getName()).log(Level.SEVERE, null, ex);
        }
        //--------------------
    }

    private void loadAllAdminsToTable() throws ClassNotFoundException, SQLException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM admin");
        ResultSet rst = stm.executeQuery();

        ObservableList<AdminProfileTM> allAdmins = FXCollections.observableArrayList();

        while (rst.next()) {
            allAdmins.add(new AdminProfileTM(String.valueOf(rst.getString(1)), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5)));
        }
        tblAdmin.setItems(allAdmins);

    }

    private void setTableCols() {
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colNic.setCellValueFactory(new PropertyValueFactory<>("nic"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colDob.setCellValueFactory(new PropertyValueFactory<>("dob"));
        colgender.setCellValueFactory(new PropertyValueFactory<>("gender"));
    }

    @FXML
    private void deleteRecord(MouseEvent event) {
        try {
            Connection con = DBConnection.getInstance().getConnection();
            PreparedStatement stm = con.prepareStatement("delete from admin  where admin_id=? ");

            stm.setObject(1, idbox.getText());

            boolean isAdded = stm.executeUpdate() > 0;
            if (isAdded) {
                JOptionPane.showMessageDialog(null, "delete sucessfully");
                loadAllAdminsToTable();
            } else {
                JOptionPane.showMessageDialog(null, "NOT delete");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminprofileController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminprofileController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @FXML
    private void tableadminOnMouseClicked(MouseEvent event) {

        AdminProfileTM admin = tblAdmin.getSelectionModel().getSelectedItem();

        idbox.setText(admin.getId());
        namebox.setText(admin.getName());
        nicbox.setText(admin.getNic());
        dobbox.setText(admin.getDob());
        genderbox.setText(admin.getGender());
    }

    @FXML
    private void backOnClick(MouseEvent event) {

        try {
            Parent load = FXMLLoader.load(this.getClass().getResource("../view/adminScreen.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(load));

            stage.show();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
