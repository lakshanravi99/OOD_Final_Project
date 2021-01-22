package model;

import java.sql.Date;

public class attendence implements SuperEntity{
    private String std_id;
    private String course_id;
    private Date date;
    private String type;
    private String att_status;
    private String hours;

    public attendence() {
    }

    public attendence(String std_id, String course_id, Date date, String type, String att_status, String hours) {
        this.std_id = std_id;
        this.course_id = course_id;
        this.date = date;
        this.type = type;
        this.att_status = att_status;
        this.hours = hours;
    }

    public String getStd_id() {
        return std_id;
    }

    public void setStd_id(String std_id) {
        this.std_id = std_id;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAtt_status() {
        return att_status;
    }

    public void setAtt_status(String att_status) {
        this.att_status = att_status;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "attendence{" +
                "std_id='" + std_id + '\'' +
                ", course_id='" + course_id + '\'' +
                ", date=" + date +
                ", type='" + type + '\'' +
                ", att_status='" + att_status + '\'' +
                ", hours='" + hours + '\'' +
                '}';
    }
}
