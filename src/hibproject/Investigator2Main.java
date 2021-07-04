/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibproject;

import static java.lang.System.out;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Jayshri Dubey
 */
public class Investigator2Main {
    public static void main(String...ar) {
        Configuration conf = new Configuration();
        Configuration c1 = conf.configure();
        SessionFactory sf;
        sf = c1.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        Scanner sc = new Scanner(System.in);
        
        out.println("Enter ID");
        String inv2Id = sc.next();
        out.println("Enter Password");
        String inv2Pass = sc.next();
        Investigator2 inv2 = new Investigator2(inv2Id, inv2Pass);
        session.save(inv2);
        tx.commit();
        session.close();
        out.println("Success!!!!!!!!!!!!!!");
    }
}
