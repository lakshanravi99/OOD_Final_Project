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
public class LeMediTM {
    private String stdid;
    private String cid;
    private String date;
    private String TYPE;
    private String STATUS;
    private String HOURS;
            
    public LeMediTM(String stdid, String cid, String date, String TYPE,String STATUS,String HOURS) {
        this.stdid = stdid;
        this.cid = cid;
        this.date = date;
        this.TYPE = TYPE;
        this.STATUS = STATUS;
        this.HOURS =HOURS;
    }

    public String getStdid() {
        return stdid;
    }

    public String getCid() {
        return cid;
    }

    public String getDate() {
        return date;
    }

    public String getTYPE() {
        return TYPE;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public String getHOURS() {
        return HOURS;
    }

    public void setStdid(String stdid) {
        this.stdid = stdid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }

    public void setHOURS(String HOURS) {
        this.HOURS = HOURS;
    }

    @Override
    public String toString() {
        return "LeMediTM{" +
                "stdid='" + stdid + '\'' +
                ", cid='" + cid + '\'' +
                ", date='" + date + '\'' +
                ", TYPE='" + TYPE + '\'' +
                ", STATUS='" + STATUS + '\'' +
                ", HOURS='" + HOURS + '\'' +
                '}';
    }
}
