package model;

public class icttimetable implements SuperEntity{
    private String Time;
    private String Monday;
    private String Tuesday;
    private String Wednesday;
    private String Thursday;
    private String Friday;

    public icttimetable() {
    }

    public icttimetable(String time, String monday, String tuesday, String wednesday, String thursday, String friday) {
        this.Time = time;
        this.Monday = monday;
        this.Tuesday = tuesday;
        this.Wednesday = wednesday;
        this.Thursday = thursday;
        this.Friday = friday;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getMonday() {
        return Monday;
    }

    public void setMonday(String monday) {
        Monday = monday;
    }

    public String getTuesday() {
        return Tuesday;
    }

    public void setTuesday(String tuesday) {
        Tuesday = tuesday;
    }

    public String getWednesday() {
        return Wednesday;
    }

    public void setWednesday(String wednesday) {
        Wednesday = wednesday;
    }

    public String getThursday() {
        return Thursday;
    }

    public void setThursday(String thursday) {
        Thursday = thursday;
    }

    public String getFriday() {
        return Friday;
    }

    public void setFriday(String friday) {
        Friday = friday;
    }

    @Override
    public String toString() {
        return "icttimetable{" +
                "Time='" + Time + '\'' +
                ", Monday='" + Monday + '\'' +
                ", Tuesday='" + Tuesday + '\'' +
                ", Wednesday='" + Wednesday + '\'' +
                ", Thursday='" + Thursday + '\'' +
                ", Friday='" + Friday + '\'' +
                '}';
    }
}



