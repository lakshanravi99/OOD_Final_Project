/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tm;

/**
 *
 * @author Lakshitha
 */
public class AdminTimeTableTM {
    private String timectr;
    private String mondaycol;
    private String tuesdaycol;
    private String wednesdaycol;
    private String thursdaycol;
    private String fridaycol;
    
    

public AdminTimeTableTM(String timectr,String mondaycol,String tuesdaycol,String wednesdaycol,String thursdaycol,String fridaycol){

    this.timectr = timectr;
    this.mondaycol = mondaycol;
    this.tuesdaycol = tuesdaycol;
    this.wednesdaycol = wednesdaycol;
    this.thursdaycol =  thursdaycol;
    this.fridaycol =  fridaycol;
    

}

    public String getTimectr() {
        return timectr;
    }

    public String getMondaycol() {
        return mondaycol;
    }

    public String getTuesdaycol() {
        return tuesdaycol;
    }

    public String getWednesdaycol() {
        return wednesdaycol;
    }

    public String getThursdaycol() {
        return thursdaycol;
    }

    public String getFridaycol() {
        return fridaycol;
    }

    public void setTimectr(String timectr) {
        this.timectr = timectr;
    }

    public void setMondaycol(String mondaycol) {
        this.mondaycol = mondaycol;
    }

    public void setTuesdaycol(String tuesdaycol) {
        this.tuesdaycol = tuesdaycol;
    }

    public void setWednesdaycol(String wednesdaycol) {
        this.wednesdaycol = wednesdaycol;
    }

    public void setThursdaycol(String thursdaycol) {
        this.thursdaycol = thursdaycol;
    }

    public void setFridaycol(String fridaycol) {
        this.fridaycol = fridaycol;
    }


    @Override
    public String toString() {
        return "AdminTimeTableTM{" +
                "timectr='" + timectr + '\'' +
                ", mondaycol='" + mondaycol + '\'' +
                ", tuesdaycol='" + tuesdaycol + '\'' +
                ", wednesdaycol='" + wednesdaycol + '\'' +
                ", thursdaycol='" + thursdaycol + '\'' +
                ", fridaycol='" + fridaycol + '\'' +
                '}';
    }
}
