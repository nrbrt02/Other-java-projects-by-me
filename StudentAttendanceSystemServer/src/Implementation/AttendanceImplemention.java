/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementation;

import Dao.AttendanceDao;
import Model.Attendance;
import Services.AttendanceServices;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author ZIPTECH LTD
 */
public class AttendanceImplemention extends UnicastRemoteObject implements AttendanceServices {

    AttendanceDao dao = new AttendanceDao();

    public AttendanceImplemention() throws RemoteException {
    }

    @Override
    public Attendance saveAttendance(Attendance AttendanceObj) throws RemoteException {
        return dao.addOrUpdateAttendance(AttendanceObj);
    }

    @Override
    public List<Attendance> allAttendances() throws RemoteException {
        return dao.allAttendance();
    }

    @Override
    public List<Attendance> searchAttByStudent(Attendance attObj) throws RemoteException {
        return dao.searchAttByStudent(attObj);
    }

    @Override
    public List<Attendance> searchAttByClass(Attendance attObj) throws RemoteException {
        return dao.searchAttByClass(attObj);
    }

    @Override
    public List<Attendance> searchAttByClassAndDate(Attendance attObj) throws RemoteException {
        return dao.searchAttByClassAndDate(attObj);
    }

    
}
