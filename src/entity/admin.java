package entity;

import java.sql.Date;

public class admin {
    private String admin_id;
    private String admin_nic;
    private String admin_name;
    private Date admin_dob;
    private String admin_gender;

    public admin() {
    }

    public admin(String admin_id, String admin_nic, String admin_name, Date admin_dob, String admin_gender) {
        this.setAdmin_id(admin_id);
        this.setAdmin_nic(admin_nic);
        this.setAdmin_name(admin_name);
        this.setAdmin_dob(admin_dob);
        this.setAdmin_gender(admin_gender);
    }

    public String getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(String admin_id) {
        this.admin_id = admin_id;
    }

    public String getAdmin_nic() {
        return admin_nic;
    }

    public void setAdmin_nic(String admin_nic) {
        this.admin_nic = admin_nic;
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public Date getAdmin_dob() {
        return admin_dob;
    }

    public void setAdmin_dob(Date admin_dob) {
        this.admin_dob = admin_dob;
    }

    public String getAdmin_gender() {
        return admin_gender;
    }

    public void setAdmin_gender(String admin_gender) {
        this.admin_gender = admin_gender;
    }


    @Override
    public String toString() {
        return "admin{" +
                "admin_id='" + admin_id + '\'' +
                ", admin_nic='" + admin_nic + '\'' +
                ", admin_name='" + admin_name + '\'' +
                ", admin_dob=" + admin_dob +
                ", admin_gender='" + admin_gender + '\'' +
                '}';
    }
}
