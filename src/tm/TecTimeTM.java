
package tm;

public class TecTimeTM {
    
    
    private String time;
    private String mon;
    private String tue;
    private String wed;
    private String thurs;
    private String fri;

    public TecTimeTM() {
    }

    public TecTimeTM(String time, String mon, String tue, String wed, String thurs, String fri) {
        this.setTime(time);
        this.setMon(mon);
        this.setTue(tue);
        this.setWed(wed);
        this.setThurs(thurs);
        this.setFri(fri);
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public String getTue() {
        return tue;
    }

    public void setTue(String tue) {
        this.tue = tue;
    }

    public String getWed() {
        return wed;
    }

    public void setWed(String wed) {
        this.wed = wed;
    }

    public String getThurs() {
        return thurs;
    }

    public void setThurs(String thurs) {
        this.thurs = thurs;
    }

    public String getFri() {
        return fri;
    }

    public void setFri(String fri) {
        this.fri = fri;
    }

    @Override
    public String toString() {
        return "TecTimeTM{" +
                "time='" + time + '\'' +
                ", mon='" + mon + '\'' +
                ", tue='" + tue + '\'' +
                ", wed='" + wed + '\'' +
                ", thurs='" + thurs + '\'' +
                ", fri='" + fri + '\'' +
                '}';
    }
}
