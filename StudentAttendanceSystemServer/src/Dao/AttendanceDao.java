/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Attendance;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author ZIPTECH LTD
 */
public class AttendanceDao {

    public Attendance addOrUpdateAttendance(Attendance attObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.saveOrUpdate(attObj);
            tr.commit();
            ss.close();
            return attObj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Attendance> searchAttByClass(Attendance attObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Attendance> theClass = ss.createCriteria(Attendance.class).add(Restrictions.eq("theClass", attObj.getTheClass())).list();
            ss.close();
            return theClass;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Attendance> searchAttByClassAndDate(Attendance attObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Attendance> theClass = ss.createCriteria(Attendance.class)
                    .add(Restrictions.eq("theClass", attObj.getTheClass()))
                    .add(Restrictions.eq("date", attObj.getDate()))
                    .list();

            ss.close();
            return theClass;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Attendance> searchAttByStudent(Attendance attObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Attendance> theClass = ss.createCriteria(Attendance.class).add(Restrictions.eq("theStudent", attObj.getTheStudent())).list();
            ss.close();
            return theClass;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Attendance> allAttendance() {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Attendance> Attendance = ss.createCriteria(Attendance.class).addOrder(Order.desc("date")).list();
            return Attendance;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
