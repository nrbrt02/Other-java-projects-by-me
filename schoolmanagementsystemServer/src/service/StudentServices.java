/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import Model.Student;

/**
 *
 * @author LOGAN
 */
public interface StudentServices extends Remote{
    
    Student creatStudent(Student studentObj) throws RemoteException;
    Student updateStudent(Student studentObj) throws RemoteException;
    Student deleteStudent(Student studentObj) throws RemoteException;
    Student searchStudent(Student studentObj) throws RemoteException;
    List<Student> allStudents() throws RemoteException;
}
