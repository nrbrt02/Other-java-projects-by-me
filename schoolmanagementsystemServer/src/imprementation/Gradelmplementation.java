/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprementation;

import dao.Gradedao;
import dao.Studentdao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import Model.Grade;
import service.GradeService;
import service.StudentServices;
import sun.rmi.server.UnicastRef;

/**
 *
 * @author LOGAN
 */
public class Gradelmplementation extends UnicastRemoteObject implements GradeService{
    Gradedao dao = new Gradedao();

    public Gradelmplementation()throws RemoteException {
    }

    @Override
    public Grade creatGrade(Grade GradeObj) throws RemoteException {
      return dao.saveGrade(GradeObj);
    }

    @Override
    public Grade updateGrade(Grade GradeObj) throws RemoteException {
       return dao.updateGrade(GradeObj);
    }

    @Override
    public Grade deleteGrade(Grade GradeObj) throws RemoteException {
    return dao.deleteGrade(GradeObj);
    }

    @Override
    public Grade searchGrade(Grade GradeObj) throws RemoteException {
    return dao.searchGrade(GradeObj);
    }

    @Override
    public List<Grade> allGrade() throws RemoteException {
        return dao.allGrade();
    }

  
}
