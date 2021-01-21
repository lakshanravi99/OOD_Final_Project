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
public class stunoticeTM {
    
    private String idcol;
    private String datecol;
    private String noticecol;

    public stunoticeTM(String idcol, String datecol, String noticecol) {
        this.idcol = idcol;
        this.datecol = datecol;
        this.noticecol = noticecol;
    }

    public String getIdcol() {
        return idcol;
    }

    public void setIdcol(String idcol) {
        this.idcol = idcol;
    }

    public String getDatecol() {
        return datecol;
    }

    public void setDatecol(String datecol) {
        this.datecol = datecol;
    }

    public String getNoticecol() {
        return noticecol;
    }

    public void setNoticecol(String noticecol) {
        this.noticecol = noticecol;
    }
    
    
     
    @Override
    public String toString() {
        return "stunoticeTM{" + "idcol=" + idcol + ", datecol=" + datecol + " noticecol=" + noticecol +'}';
    }
    
    
}
