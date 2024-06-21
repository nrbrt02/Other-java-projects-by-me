/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import Model.Classs;
/**
 *
 * @author ZIPTECH LTD
 */
public interface ClasssServices extends Remote{
    Classs saveClasss(Classs ClasssObj) throws RemoteException;
    Classs deleteClasss(Classs ClasssObj) throws RemoteException;
    Classs searchClasss(Classs ClasssObj) throws RemoteException;
    List<Classs> allClassss() throws RemoteException;
}
