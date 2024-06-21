/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Model.Admin;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ZIPTECH LTD
 */
public interface AdminServices extends Remote{
    
    public List<Admin> loginAccount(Admin adminObj)throws RemoteException;
    public Admin addAdmin(Admin adminObj) throws RemoteException;
    public Integer changeStatusAdmin(Admin adminObj)throws RemoteException;
}
