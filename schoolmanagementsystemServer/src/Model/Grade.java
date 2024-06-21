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
 * @author User
 */
@Entity
public class Grade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String grade;
    private String date;
    
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student theStudent;
    
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course theCourse;

    public Grade() {
    }

    public Grade(Integer id, String grade, String date, Student theStudent, Course theCourse) {
        this.id = id;
        this.grade = grade;
        this.date = date;
        this.theStudent = theStudent;
        this.theCourse = theCourse;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Student getTheStudent() {
        return theStudent;
    }

    public void setTheStudent(Student theStudent) {
        this.theStudent = theStudent;
    }

    public Course getTheCourse() {
        return theCourse;
    }

    public void setTheCourse(Course theCourse) {
        this.theCourse = theCourse;
    }
  
}
