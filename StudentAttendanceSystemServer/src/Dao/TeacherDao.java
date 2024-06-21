/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Teacher;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author ZIPTECH LTD
 */
public class TeacherDao {

    public Teacher addOrUpdateTeacher(Teacher teahcerObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.saveOrUpdate(teahcerObj);
            tr.commit();
            ss.close();
            return teahcerObj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Teacher deleteTeacher(Teacher teahcerObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(teahcerObj);
            tr.commit();
            ss.close();
            return teahcerObj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Teacher searchTeacher(Teacher empObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Teacher theEmp = (Teacher) ss.get(Teacher.class, empObj.getTeacherId());
            ss.close();
            return theEmp;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Teacher> allTeachers() {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Teacher> Teachers = ss.createCriteria(Teacher.class).list();
            return Teachers;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Teacher> loginTeacher(Teacher teacherObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Criteria criteria = ss.createCriteria(Teacher.class);
            criteria.add(Restrictions.eq("email", teacherObj.getEmail()));
            criteria.add(Restrictions.eq("password", teacherObj.getPassword()));
            List<Teacher> foundAccount = criteria.list();
            ss.close();
            return foundAccount;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
//    public List<Teacher> searchByEmail(String email) {
//        try {
//            Session ss = HibernateUtil.getSessionFactory().openSession();
//            List<Teacher> Teachere = ss.createCriteria(Teacher.class).add(Restrictions.eq("Email", email)).list();
//            return Teachere;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
}
