/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementation;

import Dao.StudiesDao;
import Model.Studies;
import Services.StudiesServices;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author ZIPTECH LTD
 */
public class StudiesImplementation extends UnicastRemoteObject implements StudiesServices{
        StudiesDao dao = new StudiesDao();

    public StudiesImplementation() throws RemoteException{
    }

    @Override
    public Studies saveStudies(Studies StudiesObj) throws RemoteException {
        return dao.addOrUpdateStudies(StudiesObj);
    }

    @Override
    public Studies delete(Studies StudiesObj) throws RemoteException {
        return dao.deleteStudies(StudiesObj);
    }

    @Override
    public List<Studies> searchStudiesStudent(Studies StudiesObj) throws RemoteException {
        return dao.searchStudiesStudent(StudiesObj);
    }

    @Override
    public List<Studies> searchStudiesClass(Studies StudiesObj) throws RemoteException {
        return dao.searchStudiesClass(StudiesObj);
    }

    @Override
    public List<Studies> allStudiess() throws RemoteException {
        return dao.allStudiess();
    }
        
    
        
}
