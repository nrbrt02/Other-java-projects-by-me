/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import Model.Course;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author LOGAN
 */
public class Coursedao {

    public Course savecourse(Course courseobj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.saveOrUpdate(courseobj);
            tr.commit();
            ss.close();
            return courseobj;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Course updatecourse(Course courseobj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(courseobj);
            tr.commit();
            ss.close();
            return courseobj;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Course deletecourse(Course courseobj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(courseobj);
            tr.commit();
            ss.close();
            return courseobj;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Course researchcourse(Course courseobj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Course tehCourse = (Course) ss.get(Course.class, courseobj.getId());
            ss.close();
            return tehCourse;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Course> allCourse() {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Course> courses = ss.createCriteria(Course.class).list();
            ss.close();

            return courses;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
