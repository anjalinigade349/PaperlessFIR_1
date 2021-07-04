/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package call.the.connection;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Jayshri Dubey
 */
public class ConnectionFactory {
    static SessionFactory sf;
    static {
        sf = new Configuration().configure().buildSessionFactory();
    }
    public static SessionFactory emergencyConnection() {
        if(sf.isClosed())
            sf = new Configuration().configure().buildSessionFactory();
            return sf;
    }
}
