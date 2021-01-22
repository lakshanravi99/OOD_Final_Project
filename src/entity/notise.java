package entity;

import java.sql.Date;

public class notise {
    private int notise_id;
    private Date notise_date;
    private String notise_description;

    public notise() {
    }

    public notise(int notise_id, Date notise_date, String notise_description) {
        this.notise_id = notise_id;
        this.notise_date = notise_date;
        this.notise_description = notise_description;
    }

    public int getNotise_id() {
        return notise_id;
    }

    public void setNotise_id(int notise_id) {
        this.notise_id = notise_id;
    }

    public Date getNotise_date() {
        return notise_date;
    }

    public void setNotise_date(Date notise_date) {
        this.notise_date = notise_date;
    }

    public String getNotise_description() {
        return notise_description;
    }

    public void setNotise_description(String notise_description) {
        this.notise_description = notise_description;
    }

    @Override
    public String toString() {
        return "notise{" +
                "notise_id=" + notise_id +
                ", notise_date=" + notise_date +
                ", notise_description='" + notise_description + '\'' +
                '}';
    }
}
