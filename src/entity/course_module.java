package entity;

public class course_module {
    private String course_id;
    private String name;
    private String theory;
    private String practical;
    private String lec_id;
    private String dep_id;

    public course_module() {
    }

    public course_module(String course_id, String name, String theory, String practical, String lec_id, String dep_id) {
        this.course_id = course_id;
        this.name = name;
        this.theory = theory;
        this.practical = practical;
        this.lec_id = lec_id;
        this.dep_id = dep_id;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTheory() {
        return theory;
    }

    public void setTheory(String theory) {
        this.theory = theory;
    }

    public String getPractical() {
        return practical;
    }

    public void setPractical(String practical) {
        this.practical = practical;
    }

    public String getLec_id() {
        return lec_id;
    }

    public void setLec_id(String lec_id) {
        this.lec_id = lec_id;
    }

    public String getDep_id() {
        return dep_id;
    }

    public void setDep_id(String dep_id) {
        this.dep_id = dep_id;
    }

    @Override
    public String toString() {
        return "course_module{" +
                "course_id='" + course_id + '\'' +
                ", name='" + name + '\'' +
                ", theory='" + theory + '\'' +
                ", practical='" + practical + '\'' +
                ", lec_id='" + lec_id + '\'' +
                ", dep_id='" + dep_id + '\'' +
                '}';
    }
}
