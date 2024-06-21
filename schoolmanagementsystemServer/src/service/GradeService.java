/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import Model.Grade;

/**
 *
 * @author LOGAN
 */
public interface GradeService extends Remote{
       Grade creatGrade (Grade GradeObj) throws RemoteException;
       Grade updateGrade(Grade GradeObj) throws RemoteException;
       Grade deleteGrade(Grade GradeObj) throws RemoteException;
       Grade searchGrade(Grade GradeObj) throws RemoteException;
        List<Grade> allGrade() throws RemoteException;
    
}
