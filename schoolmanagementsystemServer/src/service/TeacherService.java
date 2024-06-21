/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import Model.Teacher;

/**
 *
 * @author LOGAN
 */
public interface TeacherService extends Remote {

    Teacher creatTeacher(Teacher TeacherObj) throws RemoteException;

    Teacher updateTeacher(Teacher TeacherObj) throws RemoteException;

    Teacher deleteTeacher(Teacher TeacherObj) throws RemoteException;

    Teacher searchTeacher(Teacher TeacherObj) throws RemoteException;

    List<Teacher> allTeacher() throws RemoteException;

}
