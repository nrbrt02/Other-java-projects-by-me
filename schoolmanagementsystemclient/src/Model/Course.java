package Model;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class Course implements Serializable {

    private Integer id;
    private String code;
    private String name;
    private String credit;
    private Teacher theTeacher;

    public Course() {
    }

    public Course(Integer id, String code, String name, String credit, Teacher theTeacher) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.credit = credit;
        this.theTeacher = theTeacher;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public Teacher getTheTeacher() {
        return theTeacher;
    }

    public void setTheTeacher(Teacher theTeacher) {
        this.theTeacher = theTeacher;
    }

}
