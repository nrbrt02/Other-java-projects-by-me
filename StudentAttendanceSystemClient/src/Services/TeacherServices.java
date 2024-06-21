/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Model.Teacher;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ZIPTECH LTD
 */
public interface TeacherServices extends Remote{
    Teacher saveTeacher(Teacher teacherObj) throws RemoteException;
    Teacher delete(Teacher teacherObj) throws RemoteException;
    Teacher searchTeacher(Teacher teacherObj) throws RemoteException;
    List<Teacher> allTeachers() throws RemoteException;
    List<Teacher> loginTeacher(Teacher teacherObj) throws RemoteException;
}
