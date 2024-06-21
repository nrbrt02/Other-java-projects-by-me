/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Model.Student;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ZIPTECH LTD
 */
public interface StudentServices extends Remote{
    Student saveStudent(Student studetnObj) throws RemoteException;
    Student delete(Student studetnObj) throws RemoteException;
    Student searchStudent(Student studetnObj) throws RemoteException;
    List<Student> allStudents() throws RemoteException;
    
}
