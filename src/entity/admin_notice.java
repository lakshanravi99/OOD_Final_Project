package entity;

import java.sql.Date;

public class admin_notice {
    private String notice_id;
    private Date notice_date;
    private String notice;

    public admin_notice() {
    }

    public admin_notice(String notice_id, Date notice_date, String notice) {
        this.notice_id = notice_id;
        this.notice_date = notice_date;
        this.notice = notice;
    }

    public String getNotice_id() {
        return notice_id;
    }

    public void setNotice_id(String notice_id) {
        this.notice_id = notice_id;
    }

    public Date getNotice_date() {
        return notice_date;
    }

    public void setNotice_date(Date notice_date) {
        this.notice_date = notice_date;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    @Override
    public String toString() {
        return "admin_notice{" +
                "notice_id='" + notice_id + '\'' +
                ", notice_date=" + notice_date +
                ", notice='" + notice + '\'' +
                '}';
    }
}

