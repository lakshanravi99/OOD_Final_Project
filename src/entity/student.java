package entity;

public class student {
    private String std_id;
    private String f_name;
    private String l_name;
    private String gender;
    private String Address;
    private String status;

    public student() {
    }

    public student(String std_id, String f_name, String l_name, String gender, String address, String status) {
        this.std_id = std_id;
        this.f_name = f_name;
        this.l_name = l_name;
        this.gender = gender;
        this.Address = Address;
        this.status = status;


    }

    public String getStd_id() {
        return std_id;
    }

    public void setStd_id(String std_id) {
        this.std_id = std_id;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String
    toString() {
        return "student{" +
                "std_id='" + std_id + '\'' +
                ", f_name='" + f_name + '\'' +
                ", l_name='" + l_name + '\'' +
                ", gender='" + gender + '\'' +
                ", Address='" + Address + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
