package model;

public class user implements SuperEntity{
    private String id;
    private String username;
    private String password;
    private String designation;

    public user() {
    }

    public user(String id, String username, String password, String designation) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.designation = designation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "user{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
