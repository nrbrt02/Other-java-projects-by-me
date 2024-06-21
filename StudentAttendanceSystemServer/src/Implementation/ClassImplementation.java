/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementation;

import Dao.ClassDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import Model.Classs;
import Services.ClasssServices;

/**
 *
 * @author ZIPTECH LTD
 */
public class ClassImplementation extends UnicastRemoteObject implements ClasssServices{
    ClassDao dao = new ClassDao();

    public ClassImplementation() throws RemoteException{
    }

    @Override
    public Classs saveClasss(Classs ClasssObj) throws RemoteException {
        return dao.addOrUpdateClass(ClasssObj);
    }

    @Override
    public Classs deleteClasss(Classs ClasssObj) throws RemoteException {
        return dao.deleteClass(ClasssObj);
    }

    @Override
    public Classs searchClasss(Classs ClasssObj) throws RemoteException {
        return dao.searchClass(ClasssObj);
    }

    @Override
    public List<Classs> allClassss() throws RemoteException {
        return dao.allClasss();
    }

}
