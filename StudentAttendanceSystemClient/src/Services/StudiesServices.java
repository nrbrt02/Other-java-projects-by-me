/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Model.Studies;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ZIPTECH LTD
 */
public interface StudiesServices extends Remote {

    Studies saveStudies(Studies StudiesObj) throws RemoteException;

    Studies delete(Studies StudiesObj) throws RemoteException;

    List<Studies> searchStudiesStudent(Studies StudiesObj) throws RemoteException;

    List<Studies> searchStudiesClass(Studies StudiesObj) throws RemoteException;

    List<Studies> allStudiess() throws RemoteException;
}
