/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import Model.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author LOGAN
 */
public class Studentdao {

    public Student saveStudent(Student studentObj) {
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

    public Student updateStudent(Student studentObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(studentObj);
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

    public Student searchStudent(Student studentObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Student theStudent = (Student) ss.get(Student.class, studentObj.getStudentId());
            ss.close();

            return theStudent;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Student> allStudent() {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Student> students = ss.createCriteria(Student.class).list();
            ss.close();

            return students;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
