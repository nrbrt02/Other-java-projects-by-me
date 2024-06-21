/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Model.Admin;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author ZIPTECH LTD
 */
public class AdminDao {

    public List<Admin> loginAccount(Admin adminObj) {

        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Criteria criteria = ss.createCriteria(Admin.class);
            criteria.add(Restrictions.eq("email", adminObj.getEmail()));
            criteria.add(Restrictions.eq("password", adminObj.getPassword()));
            List<Admin> foundAccount = criteria.list();
            ss.close();
            return foundAccount;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Admin addAdmin(Admin adminObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(adminObj);

            tr.commit();
            ss.close();
            return adminObj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Integer changeStatusAdmin(Admin adminObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();

            Query query = (Query) ss.createQuery("UPDATE Admin a SET a.isVerified = :status WHERE a.id = :id");
            query.setParameter("status", true);
            query.setParameter("id", adminObj.getId());

            Integer adm = query.executeUpdate();
            tr.commit();
            ss.close();
            return adm;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
