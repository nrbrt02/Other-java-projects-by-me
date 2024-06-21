/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprementation;

import dao.Coursedao;
import dao.Gradedao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import Model.Course;
import service.CourseService;
import service.GradeService;

/**
 *
 * @author LOGAN
 */
public class Courselmplementation extends UnicastRemoteObject implements CourseService {

    Coursedao dao = new Coursedao();

    public Courselmplementation() throws RemoteException {
    }

    @Override
    public Course creatCourse(Course CourseObj) throws RemoteException {
        return dao.savecourse(CourseObj);
    }

    @Override
    public Course updateCourse(Course CourseObj) throws RemoteException {
        return dao.updatecourse(CourseObj);
    }

    @Override
    public Course deleteCourse(Course CourseObj) throws RemoteException {
        return dao.deletecourse(CourseObj);
    }

    @Override
    public Course searchCourse(Course CourseObj) throws RemoteException {
        return dao.researchcourse(CourseObj);
    }

    @Override
    public List<Course> allCourses() throws RemoteException {
        return dao.allCourse();
    }

}
