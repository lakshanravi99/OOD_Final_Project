package entity;

public class department {
    private String dep_id;
    private String dep_name;
    private String location;

    public department() {
    }

    public department(String dep_id, String dep_name, String location) {
        this.dep_id = dep_id;
        this.dep_name = dep_name;
        this.location = location;
    }

    public String getDep_id() {
        return dep_id;
    }

    public void setDep_id(String dep_id) {
        this.dep_id = dep_id;
    }

    public String getDep_name() {
        return dep_name;
    }

    public void setDep_name(String dep_name) {
        this.dep_name = dep_name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "department{" +
                "dep_id='" + dep_id + '\'' +
                ", dep_name='" + dep_name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
