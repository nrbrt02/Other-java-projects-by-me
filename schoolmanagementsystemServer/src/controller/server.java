
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import imprementation.Courselmplementation;
import imprementation.Gradelmplementation;
import imprementation.StudentImplmentation;
import imprementation.Teacherlmplementation;
import imprementation.AdminImplementation;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author LOGAN
 */
public class server {

    public static void main(String[] args) {
        try {
            System.setProperty("java.armi.server.hostname", "127.0.0.7");
            Registry theRegistry = LocateRegistry.createRegistry(81);
            theRegistry.rebind("student", new StudentImplmentation());
            theRegistry.rebind("grade", new Gradelmplementation());
            theRegistry.rebind("admin-login", new AdminImplementation());
            theRegistry.bind("course", new Courselmplementation());
            theRegistry.bind("teacher", new Teacherlmplementation());
            System.out.println("server is running on port 81");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
