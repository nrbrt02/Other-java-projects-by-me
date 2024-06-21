/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author ZIPTECH LTD
 */
@Entity
public class Studies implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student theStudent;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private Classs theClass;

    public Studies() {
    }

    public Studies(Integer id, Student theStudent, Classs theClass) {
        this.id = id;
        this.theStudent = theStudent;
        this.theClass = theClass;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
