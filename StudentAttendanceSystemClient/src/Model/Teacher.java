/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 *
 * @author ZIPTECH LTD
 */
public class Teacher implements Serializable{
    private Integer teacherId;
    private String names;
    private String email;
    private String phone;
    private String faculty;
    private String gender;
    private String password;

    public Teacher() {
    }

    public Teacher(Integer teacherId, String names, String email, String phone, String faculty, String gender, String password) {
        this.teacherId = teacherId;
        this.names = names;
        this.email = email;
        this.phone = phone;
        this.faculty = faculty;
        this.gender = gender;
        this.password = password;
    }



    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
