package entity;

import java.sql.Date;

public class lecture {
    private String lec_id;
    private String username;
    private String f_name;
    private String gender;
    private Date dob;
    private int contact_no;
    private String password;

    public lecture() {
    }

    public lecture(String lec_id, String username, String f_name, String gender, Date dob, int contact_no, String password) {
        this.lec_id = lec_id;
        this.username = username;
        this.f_name = f_name;
        this.gender = gender;
        this.dob = dob;
        this.contact_no = contact_no;
        this.password = password;
    }

    public String getLec_id() {
        return lec_id;
    }

    public void setLec_id(String lec_id) {
        this.lec_id = lec_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getContact_no() {
        return contact_no;
    }

    public void setContact_no(int contact_no) {
        this.contact_no = contact_no;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "lecture{" +
                "lec_id='" + lec_id + '\'' +
                ", username='" + username + '\'' +
                ", f_name='" + f_name + '\'' +
                ", gender='" + gender + '\'' +
                ", dob=" + dob +
                ", contact_no=" + contact_no +
                ", password='" + password + '\'' +
                '}';
    }
}
