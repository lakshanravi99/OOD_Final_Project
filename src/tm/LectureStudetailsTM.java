
package tm;


public class LectureStudetailsTM {
        
    private String stu_id;
    private String f_name;
    private String l_name;
    private String gender;
    private String address;
    private String status;

    public LectureStudetailsTM(String stu_id, String f_name, String l_name, String gender, String address, String status) {
        this.stu_id = stu_id;
        this.f_name = f_name;
        this.l_name = l_name;
        this.gender = gender;
        this.address = address;
        this.status = status;
    }

    public String getStu_id() {
        return stu_id;
    }

    public String getF_name() {
        return f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getStatus() {
        return status;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "LectureStudetailsTM{" +
                "stu_id='" + stu_id + '\'' +
                ", f_name='" + f_name + '\'' +
                ", l_name='" + l_name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
