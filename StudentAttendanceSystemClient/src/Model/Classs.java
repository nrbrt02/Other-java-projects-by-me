/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;
import java.util.Set;

/**
 *
 * @author ZIPTECH LTD
 */
public class Classs implements Serializable {
    private Integer classId;
    private String name;
    private String creadits;
    private String day;
    private String time;
    private String room;
    private Integer enrolled;
    private Teacher theTeacher;

    public Classs() {
    }

    public Classs(Integer classId, String name, String creadits, String day, String time, String room, Integer enrolled, Teacher theTeacher) {
        this.classId = classId;
        this.name = name;
        this.creadits = creadits;
        this.day = day;
        this.time = time;
        this.room = room;
        this.enrolled = enrolled;
        this.theTeacher = theTeacher;
    }

    public Integer getEnrolled() {
        return enrolled;
    }

    public void setEnrolled(Integer enrolled) {
        this.enrolled = enrolled;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreadits() {
        return creadits;
    }

    public void setCreadits(String creadits) {
        this.creadits = creadits;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }


    public Teacher getTheTeacher() {
        return theTeacher;
    }

    public void setTheTeacher(Teacher theTeacher) {
        this.theTeacher = theTeacher;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    
}
