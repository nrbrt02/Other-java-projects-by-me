/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author ZIPTECH LTD
 */
@Entity
public class Attendance implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "at_Date")
    @Temporal(TemporalType.DATE)
    private Date date;
    private boolean attendanded;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student theStudent;

    @ManyToOne
    @JoinColumn(name = "class_id")
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
