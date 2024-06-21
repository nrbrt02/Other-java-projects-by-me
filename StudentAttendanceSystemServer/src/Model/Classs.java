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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author ZIPTECH LTD
 */
@Entity
@Table(
        name = "classss",
        uniqueConstraints = @UniqueConstraint(columnNames = {"name"})
)
public class Classs implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_id")
    private Integer classId;
    private String name;
    private String creadits;
    private String day;
    private String time;
    private String room;
    @Column(columnDefinition = "enrolled int default 0")
    private Integer enrolled;
    
    @ManyToOne
    @JoinColumn(name = "teacher_id")
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

    public Integer getEnrolled() {
        return enrolled;
    }

    public void setEnrolled(Integer enrolled) {
        this.enrolled = enrolled;
    }

    
    
}
