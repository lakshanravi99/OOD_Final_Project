
package tm;


public class AdminProfileTM {
    
    private String id;
    private String nic;
    private String name;
    private String dob;
    private String gender;

    public AdminProfileTM(String id, String nic, String name, String dob, String gender) {
        this.id = id;
        this.nic = nic;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public String getNic() {
        return nic;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getGender() {
        return gender;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "AdminProfileTM{" +
                "id='" + id + '\'' +
                ", nic='" + nic + '\'' +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
