/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tm;

/**
 * @author ACER
 */
public class ToMedicalTM {
    private String refnobox;
    private String courseidbox;
    private String placebox;
    private String idbox;
    private String statusbox;
    private String datebox;
    private String approvelbox;

    public ToMedicalTM() {
    }

    public ToMedicalTM(String refnobox, String courseidbox, String placebox, String idbox, String statusbox, String datebox, String approvelbox) {
        this.setRefnobox(refnobox);
        this.setCourseidbox(courseidbox);
        this.setPlacebox(placebox);
        this.setIdbox(idbox);
        this.setStatusbox(statusbox);
        this.setDatebox(datebox);
        this.setApprovelbox(approvelbox);
    }

    public String getRefnobox() {
        return refnobox;
    }

    public void setRefnobox(String refnobox) {
        this.refnobox = refnobox;
    }

    public String getCourseidbox() {
        return courseidbox;
    }

    public void setCourseidbox(String courseidbox) {
        this.courseidbox = courseidbox;
    }

    public String getPlacebox() {
        return placebox;
    }

    public void setPlacebox(String placebox) {
        this.placebox = placebox;
    }

    public String getIdbox() {
        return idbox;
    }

    public void setIdbox(String idbox) {
        this.idbox = idbox;
    }

    public String getStatusbox() {
        return statusbox;
    }

    public void setStatusbox(String statusbox) {
        this.statusbox = statusbox;
    }

    public String getDatebox() {
        return datebox;
    }

    public void setDatebox(String datebox) {
        this.datebox = datebox;
    }

    public String getApprovelbox() {
        return approvelbox;
    }

    public void setApprovelbox(String approvelbox) {
        this.approvelbox = approvelbox;
    }

    @Override
    public String toString() {
        return "ToMedicalTM{" +
                "refnobox='" + refnobox + '\'' +
                ", courseidbox='" + courseidbox + '\'' +
                ", placebox='" + placebox + '\'' +
                ", idbox='" + idbox + '\'' +
                ", statusbox='" + statusbox + '\'' +
                ", datebox='" + datebox + '\'' +
                ", approvelbox='" + approvelbox + '\'' +
                '}';
    }
}