package entity;

import java.sql.Date;

public class medical {
    private String ref_no;
    private String course_id;
    private Date submit_date;
    private String place_of_issue;
    private String std_id;
    private String status;

    public medical() {
    }

    public medical(String ref_no, String course_id, Date submit_date, String place_of_issue, String std_id, String status) {
        this.ref_no = ref_no;
        this.course_id = course_id;
        this.submit_date = submit_date;
        this.place_of_issue = place_of_issue;
        this.std_id = std_id;
        this.status = status;
    }

    public String getRef_no() {
        return ref_no;
    }

    public void setRef_no(String ref_no) {
        this.ref_no = ref_no;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public Date getSubmit_date() {
        return submit_date;
    }

    public void setSubmit_date(Date submit_date) {
        this.submit_date = submit_date;
    }

    public String getPlace_of_issue() {
        return place_of_issue;
    }

    public void setPlace_of_issue(String place_of_issue) {
        this.place_of_issue = place_of_issue;
    }

    public String getStd_id() {
        return std_id;
    }

    public void setStd_id(String std_id) {
        this.std_id = std_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "medical{" +
                "ref_no='" + ref_no + '\'' +
                ", course_id='" + course_id + '\'' +
                ", submit_date=" + submit_date +
                ", place_of_issue='" + place_of_issue + '\'' +
                ", std_id='" + std_id + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
