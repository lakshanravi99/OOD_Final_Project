/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tm;

/**
 * @author ACER
 */
public class TecOfficerNoticeTM {

    private String id;
    private String date;
    private String notice;

    public TecOfficerNoticeTM() {
    }

    public TecOfficerNoticeTM(String id, String date, String notice) {
        this.setId(id);
        this.setDate(date);
        this.setNotice(notice);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    @Override
    public String toString() {
        return "TecOfficerNoticeTM{" +
                "id='" + getId() + '\'' +
                ", date='" + getDate() + '\'' +
                ", notice='" + getNotice() + '\'' +
                '}';
    }
}
