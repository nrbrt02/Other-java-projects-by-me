/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementation;

import Dao.TeacherDao;
import Model.Teacher;
import Services.TeacherServices;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author ZIPTECH LTD
 */
public class TeacherImplementation extends UnicastRemoteObject implements TeacherServices {

    TeacherDao dao = new TeacherDao();

    public TeacherImplementation() throws RemoteException {
    }

    @Override
    public Teacher saveTeacher(Teacher teacherObj) throws RemoteException {
        return dao.addOrUpdateTeacher(teacherObj);
    }

    @Override
    public Teacher delete(Teacher teacherObj) throws RemoteException {
        return dao.deleteTeacher(teacherObj);
    }

    @Override
    public Teacher searchTeacher(Teacher teacherObj) throws RemoteException {
        return dao.searchTeacher(teacherObj);
    }

    @Override
    public List<Teacher> allTeachers() throws RemoteException {
        return dao.allTeachers();
    }

    @Override
    public List<Teacher> loginTeacher(Teacher teacherObj) throws RemoteException {
        return dao.loginTeacher(teacherObj);
    }

}
