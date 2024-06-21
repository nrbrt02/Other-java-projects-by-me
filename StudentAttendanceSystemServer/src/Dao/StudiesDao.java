/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Studies;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author ZIPTECH LTD
 */
public class StudiesDao {

    public Studies addOrUpdateStudies(Studies studiesObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.saveOrUpdate(studiesObj);
            tr.commit();
            ss.close();
            return studiesObj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Studies deleteStudies(Studies studiesObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(studiesObj);
            tr.commit();
            ss.close();
            return studiesObj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Studies> searchStudiesStudent(Studies empObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Studies> theEmp = ss.createCriteria(Studies.class).add(Restrictions.eq("theStudent", empObj.getTheStudent())).list();
            ss.close();
            return theEmp;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Studies> searchStudiesClass(Studies empObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Studies> theEmp = ss.createCriteria(Studies.class).add(Restrictions.eq("theClass", empObj.getTheClass())).list();
            ss.close();
            return theEmp;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Studies> allStudiess() {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Studies> Studiess = ss.createCriteria(Studies.class).list();
            return Studiess;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
