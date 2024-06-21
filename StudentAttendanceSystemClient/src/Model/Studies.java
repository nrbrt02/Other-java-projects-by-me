/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author ZIPTECH LTD
 */
public class Studies implements Serializable {

    private Integer id;
    private Student theStudent;
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
