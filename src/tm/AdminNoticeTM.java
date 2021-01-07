/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tm;

/**
 *
 * @author ACER
 */
public class AdminNoticeTM {
    
    private String id;
    private String date;
    private String notice;

    public AdminNoticeTM(String id, String date, String notice) {
        this.id = id;
        this.date = date;
        this.notice = notice;
    }


    public String getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getNotice() {
        return notice;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }


    @Override
    public String toString() {
        return "AdminNoticeTM{" +
                "id='" + id + '\'' +
                ", date='" + date + '\'' +
                ", notice='" + notice + '\'' +
                '}';
    }
}


