/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 *
 * @author ZIPTECH LTD
 */
public class Student implements Serializable {
    private Integer studentId;
    private String names;
    private String email;
    private String startingYear;
    private String Phone;
    private String faculty;
    private String gender;
    private String department;

    public Student() {
    }

    public Student(Integer studentId, String names, String email, String startingYear, String Phone, String faculty, String gender, String department) {
        this.studentId = studentId;
        this.names = names;
        this.email = email;
        this.startingYear = startingYear;
        this.Phone = Phone;
        this.faculty = faculty;
        this.gender = gender;
        this.department = department;
    }




    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStartingYear() {
        return startingYear;
    }

    public void setStartingYear(String startingYear) {
        this.startingYear = startingYear;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
