/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tm;


public class AdminCourseTM {
    
    private String id;
    private String name;
    private String t;
    private String p;
    private String lecid;
    private String depid;
    

    public AdminCourseTM() {
    }

    public AdminCourseTM(String id, String name, String t, String p,String lecid,String depid) {
        this.id = id;
        this.name = name;
        this.t = t;
        this.p = p;
        this.lecid = lecid;
        this.depid = depid;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getT() {
        return t;
    }

    /**
     * @param t the address to set
     */
    public void setT(String t) {
        this.t = t;
    }

    /**
     * @return the contact
     */
    public String getP() {
        return p;
    }

    /**
     * @param p the contact to set
     */
    public void setP(String p) {
        this.p = p;
    }
    
    public String getLecid() {
        return lecid;
    }

    /**
     * @param lecid the contact to set
     */
    public void setLecid(String lecid) {
        this.lecid = lecid;
    }
    
     public String getDepid() {
        return depid;
    }

    /**
     * @param depid the contact to set
     */
    public void setDepid(String depid) {
        this.depid = depid;
    }

    @Override
    public String toString() {
        return "AdminCourseTM{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", t='" + t + '\'' +
                ", p='" + p + '\'' +
                ", lecid='" + lecid + '\'' +
                ", depid='" + depid + '\'' +
                '}';
    }
}

