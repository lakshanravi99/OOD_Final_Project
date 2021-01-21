/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tm;

/**
 * @author ACER
 */
public class StdTimeTableTM {
    private String timecol;
    private String moncol;
    private String tucol;
    private String wedcol;
    private String thucol;
    private String fricol;

    public StdTimeTableTM() {
    }

    public StdTimeTableTM(String timecol, String moncol, String tucol, String wedcol, String thucol, String fricol) {
        this.setTimecol(timecol);
        this.setMoncol(moncol);
        this.setTucol(tucol);
        this.setWedcol(wedcol);
        this.setThucol(thucol);
        this.setFricol(fricol);
    }

    public String getTimecol() {
        return timecol;
    }

    public void setTimecol(String timecol) {
        this.timecol = timecol;
    }

    public String getMoncol() {
        return moncol;
    }

    public void setMoncol(String moncol) {
        this.moncol = moncol;
    }

    public String getTucol() {
        return tucol;
    }

    public void setTucol(String tucol) {
        this.tucol = tucol;
    }

    public String getWedcol() {
        return wedcol;
    }

    public void setWedcol(String wedcol) {
        this.wedcol = wedcol;
    }

    public String getThucol() {
        return thucol;
    }

    public void setThucol(String thucol) {
        this.thucol = thucol;
    }

    public String getFricol() {
        return fricol;
    }

    public void setFricol(String fricol) {
        this.fricol = fricol;
    }

    @Override
    public String toString() {
        return "StdTimeTableTM{" +
                "timecol='" + timecol + '\'' +
                ", moncol='" + moncol + '\'' +
                ", tucol='" + tucol + '\'' +
                ", wedcol='" + wedcol + '\'' +
                ", thucol='" + thucol + '\'' +
                ", fricol='" + fricol + '\'' +
                '}';
    }
}
