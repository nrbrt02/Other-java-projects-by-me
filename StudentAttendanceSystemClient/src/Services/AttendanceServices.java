/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Model.Attendance;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ZIPTECH LTD
 */
public interface AttendanceServices extends Remote{
    Attendance saveAttendance(Attendance AttendanceObj) throws RemoteException;
//    Attendance searchAttendance(Attendance AttendanceObj) throws RemoteException;
    List<Attendance> searchAttByStudent(Attendance attObj) throws RemoteException;
    List<Attendance> searchAttByClass(Attendance attObj) throws RemoteException;
    List<Attendance> searchAttByClassAndDate(Attendance attObj) throws RemoteException;
    List<Attendance> allAttendances() throws RemoteException;
}
