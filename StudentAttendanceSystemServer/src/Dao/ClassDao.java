/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import Model.Classs;
import java.util.List;
/**
 *
 * @author ZIPTECH LTD
 */
public class ClassDao {
    public Classs addOrUpdateClass(Classs classObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.saveOrUpdate(classObj);
            tr.commit();
            ss.close();
            return classObj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public Classs deleteClass(Classs classObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(classObj);
            tr.commit();
            ss.close();
            return classObj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Classs searchClass(Classs classObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Classs theClass = (Classs) ss.get(Classs.class, classObj.getClassId());
            ss.close();
            return theClass;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Classs> allClasss() {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Classs> Classs = ss.createCriteria(Classs.class).list();
            return Classs;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
