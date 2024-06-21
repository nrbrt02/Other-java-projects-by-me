/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import Model.Course;
import Model.Student;

/**
 *
 * @author LOGAN
 */
public interface CourseService extends Remote {

    Course creatCourse(Course CourseObj) throws RemoteException;

    Course updateCourse(Course CourseObj) throws RemoteException;

    Course deleteCourse(Course CourseObj) throws RemoteException;

    Course searchCourse(Course CourseObj) throws RemoteException;

    List<Course> allCourses() throws RemoteException;

}
