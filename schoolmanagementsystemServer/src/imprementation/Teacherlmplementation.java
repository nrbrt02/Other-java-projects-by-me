/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprementation;

import dao.Coursedao;
import dao.Teacherdao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import Model.Teacher;
import service.CourseService;
import service.TeacherService;

/**
 *
 * @author LOGAN
 */
public class Teacherlmplementation extends UnicastRemoteObject implements TeacherService {

    Teacherdao dao = new Teacherdao();

    public Teacherlmplementation() throws RemoteException {
    }

    @Override
    public Teacher creatTeacher(Teacher TeacherObj) throws RemoteException {
        return dao.saveTeacher(TeacherObj);
    }

    @Override
    public Teacher updateTeacher(Teacher TeacherObj) throws RemoteException {
        return dao.updateTeacher(TeacherObj);
    }

    @Override
    public Teacher deleteTeacher(Teacher TeacherObj) throws RemoteException {
        return dao.deleteTeacher(TeacherObj);
    }

    @Override
    public Teacher searchTeacher(Teacher TeacherObj) throws RemoteException {
        return dao.researchTeacher(TeacherObj);
    }

    @Override
    public List<Teacher> allTeacher() throws RemoteException {
        return dao.allTeacher();
    }

}
