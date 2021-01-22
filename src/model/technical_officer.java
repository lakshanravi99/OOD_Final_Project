package model;

import java.sql.Date;

public class technical_officer implements SuperEntity{
    private String to_id;
    private String f_name;
    private String l_name;
    private int contact_no;
    private Date dob;
    private String gender;
    private String dep_id;
    private String password;

    public technical_officer() {
    }

    public technical_officer(String to_id, String f_name, String l_name, int contact_no, Date dob, String gender, String dep_id, String password) {
        this.to_id = to_id;
        this.f_name = f_name;
        this.l_name = l_name;
        this.contact_no = contact_no;
        this.dob = dob;
        this.gender = gender;
        this.dep_id = dep_id;
        this.password = password;
    }

    public String getTo_id() {
        return to_id;
    }

    public void setTo_id(String to_id) {
        this.to_id = to_id;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public int getContact_no() {
        return contact_no;
    }

    public void setContact_no(int contact_no) {
        this.contact_no = contact_no;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDep_id() {
        return dep_id;
    }

    public void setDep_id(String dep_id) {
        this.dep_id = dep_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "technical_officer{" +
                "to_id='" + to_id + '\'' +
                ", f_name='" + f_name + '\'' +
                ", l_name='" + l_name + '\'' +
                ", contact_no=" + contact_no +
                ", dob=" + dob +
                ", gender='" + gender + '\'' +
                ", dep_id='" + dep_id + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
