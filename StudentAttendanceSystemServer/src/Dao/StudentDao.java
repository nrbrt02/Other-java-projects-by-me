/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Student;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ZIPTECH LTD
 */
public class StudentDao {
    public Student addOrUpdateStudent(Student studentObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.saveOrUpdate(studentObj);
            
            tr.commit();
            ss.close();
            return studentObj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public Student deleteStudent(Student studentObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(studentObj);
            tr.commit();
            ss.close();
            return studentObj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Student searchStudent(Student empObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Student theEmp = (Student) ss.get(Student.class, empObj.getStudentId());
            ss.close();
            return theEmp;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Student> allStudents() {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Student> Students = ss.createCriteria(Student.class).list();
            return Students;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

//    public List<Student> searchByEmail(String email) {
//        try {
//            Session ss = HibernateUtil.getSessionFactory().openSession();
//            List<Student> Studente = ss.createCriteria(Student.class).add(Restrictions.eq("Email", email)).list();
//            return Studente;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
}
