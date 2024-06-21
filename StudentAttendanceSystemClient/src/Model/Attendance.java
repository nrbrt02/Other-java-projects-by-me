/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author ZIPTECH LTD
 */
public class Attendance implements Serializable {
    private Integer id;
    private Date date;
    private boolean attendanded;
    private Student theStudent;
    private Classs theClass;

    public Attendance() {
    }

    public Attendance(Integer id, Date date, boolean attendanded, Student theStudent, Classs theClass) {
        this.id = id;
        this.date = date;
        this.attendanded = attendanded;
        this.theStudent = theStudent;
        this.theClass = theClass;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isAttendanded() {
        return attendanded;
    }

    public void setAttendanded(boolean attendanded) {
        this.attendanded = attendanded;
    }

    public Student getTheStudent() {
        return theStudent;
    }

    public void setTheStudent(Student theStudent) {
        this.theStudent = theStudent;
    }

    public Classs getTheClass() {
        return theClass;
    }

    public void setTheClass(Classs theClass) {
        this.theClass = theClass;
    }

}
