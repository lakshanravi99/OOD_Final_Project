/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tm;


public class TecAttendenceTM {
    
    
    private String id;
    private String course_id;
    private String date;
    private String type;
    private String att_status;
    private String hours;

    public TecAttendenceTM() {
    }

    public TecAttendenceTM(String id, String course_id, String date, String type, String att_status, String hours) {
        this.setId(id);
        this.setCourse_id(course_id);
        this.setDate(date);
        this.setType(type);
        this.setAtt_status(att_status);
        this.setHours(hours);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
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
        return "TecAttendenceTM{" +
                "id='" + id + '\'' +
                ", course_id='" + course_id + '\'' +
                ", date='" + date + '\'' +
                ", type='" + type + '\'' +
                ", att_status='" + att_status + '\'' +
                ", hours='" + hours + '\'' +
                '}';
    }
}
