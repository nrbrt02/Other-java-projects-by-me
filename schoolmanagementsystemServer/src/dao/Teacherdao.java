/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import Model.Teacher;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author LOGAN
 */
public class Teacherdao {

    public Teacher saveTeacher(Teacher Teacherobj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.saveOrUpdate(Teacherobj);
            tr.commit();
            ss.close();
            return Teacherobj;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Teacher updateTeacher(Teacher Teacherobj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(Teacherobj);
            tr.commit();
            ss.close();
            return Teacherobj;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Teacher deleteTeacher(Teacher Teacherobj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(Teacherobj);
            tr.commit();
            ss.close();
            return Teacherobj;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Teacher researchTeacher(Teacher Teacherobj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Teacher teacher = (Teacher) ss.get(Teacher.class, Teacherobj.getTeacherId());
            ss.close();
            return teacher;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Teacher> allTeacher() {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Teacher> teachers = ss.createCriteria(Teacher.class).list();
            ss.close();

            return teachers;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
