/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprementation;

import dao.Studentdao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import Model.Student;
import service.StudentServices;

/**
 *
 * @author LOGAN
 */
public class StudentImplmentation extends UnicastRemoteObject implements StudentServices{
    Studentdao dao = new Studentdao();

    public StudentImplmentation() throws RemoteException{
    }

    @Override
    public Student creatStudent(Student studentObj) throws RemoteException {
        return dao.saveStudent(studentObj);
    }

    @Override
    public Student updateStudent(Student studentObj) throws RemoteException {
        return dao.updateStudent(studentObj);
    }

    @Override
    public Student deleteStudent(Student studentObj) throws RemoteException {
        return dao.deleteStudent(studentObj);
    }

    @Override
    public Student searchStudent(Student studentObj) throws RemoteException {
        return dao.searchStudent(studentObj);
    }

    @Override
    public List<Student> allStudents() throws RemoteException {
        return dao.allStudent();
    }
    
    
}
