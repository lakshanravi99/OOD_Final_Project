package model;

public class AdminCourse implements SuperEntity{
    private String admin_id;
    private String course_id;

    public AdminCourse() {
    }

    public AdminCourse(String admin_id, String course_id) {
        this.setAdmin_id(admin_id);
        this.setCourse_id(course_id);
    }

    public String getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(String admin_id) {
        this.admin_id = admin_id;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    @Override
    public String toString() {
        return "admin_course{" +
                "admin_id='" + admin_id + '\'' +
                ", course_id='" + course_id + '\'' +
                '}';
    }
}
