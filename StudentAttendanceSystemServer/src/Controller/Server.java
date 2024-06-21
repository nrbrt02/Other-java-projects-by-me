/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Implementation.AdminImplementation;
import Implementation.AttendanceImplemention;
import Implementation.ClassImplementation;
import Implementation.StudentImplementation;
import Implementation.StudiesImplementation;
import Implementation.TeacherImplementation;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author ZIPTECH LTD
 */
public class Server {

    public static void main(String[] args) {
        try {
            System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            Registry theRegistry = LocateRegistry.createRegistry(81);
            theRegistry.rebind("student", new StudentImplementation());
            theRegistry.rebind("teacher", new TeacherImplementation());
            theRegistry.rebind("classs", new ClassImplementation());
            theRegistry.rebind("admin-login", new AdminImplementation());
            theRegistry.rebind("studies", new StudiesImplementation());
            theRegistry.rebind("attendance", new AttendanceImplemention());
            System.out.println("Server Running on Port 81");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
