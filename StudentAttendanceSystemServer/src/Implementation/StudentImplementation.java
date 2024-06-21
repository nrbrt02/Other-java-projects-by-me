/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementation;

import Dao.StudentDao;
import Model.Student;
import Services.StudentServices;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author ZIPTECH LTD
 */
public class StudentImplementation extends UnicastRemoteObject implements StudentServices{
    StudentDao dao = new StudentDao();

    public StudentImplementation() throws RemoteException{
    }

    @Override
    public Student saveStudent(Student studetnObj) throws RemoteException {
        return dao.addOrUpdateStudent(studetnObj);
    }

    @Override
    public Student delete(Student studetnObj) throws RemoteException {
        return dao.deleteStudent(studetnObj);
    }

    @Override
    public Student searchStudent(Student studetnObj) throws RemoteException {
        return dao.searchStudent(studetnObj);
    }

    @Override
    public List<Student> allStudents() throws RemoteException {
        return dao.allStudents();
    }
    
    
    
}
