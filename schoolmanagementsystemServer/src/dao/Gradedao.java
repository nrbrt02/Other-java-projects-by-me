/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import Model.Grade;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author LOGAN
 */
public class Gradedao {

    public Grade saveGrade(Grade Gradeobj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.saveOrUpdate(Gradeobj);
            tr.commit();
            ss.close();
            return Gradeobj;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Grade updateGrade(Grade Gradeobj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(Gradeobj);
            tr.commit();
            ss.close();
            return Gradeobj;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Grade deleteGrade(Grade Gradeobj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(Gradeobj);
            tr.commit();
            ss.close();
            return Gradeobj;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Grade searchGrade(Grade Gradeobj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Grade theStudent = (Grade) ss.get(Grade.class, Gradeobj.getId());
            ss.close();
            return theStudent;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Grade> allGrade() {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Grade> grade = ss.createCriteria(Grade.class).list();
            ss.close();

            return grade;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
