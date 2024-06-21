/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementation;

import Dao.AdminDao;
import Model.Admin;
import Services.AdminServices;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import net.sf.ehcache.distribution.RemoteCacheException;

/**
 *
 * @author ZIPTECH LTD
 */
public class AdminImplementation extends UnicastRemoteObject implements AdminServices{
    
    AdminDao dao = new AdminDao();

    public AdminImplementation() throws RemoteException{
    }

    @Override
    public List<Admin> loginAccount(Admin adminObj) throws RemoteException {
        return dao.loginAccount(adminObj);
    }

    @Override
    public Admin addAdmin(Admin adminObj) throws RemoteException {
        return dao.addAdmin(adminObj);
    }

    @Override
    public Integer changeStatusAdmin(Admin adminObj) throws RemoteCacheException {
        return dao.changeStatusAdmin(adminObj);
    }
    
    
}
