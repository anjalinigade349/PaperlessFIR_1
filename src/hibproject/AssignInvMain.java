/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibproject;

import static java.lang.System.in;
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
public class AssignInvMain {
    public static void main(String...ar) {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        out.println("Enter fir number to assign investigator");
        Scanner sc = new Scanner(in);
        int FIRNumb = sc.nextInt();

        FIR fir = (FIR)session.get(FIR.class, FIRNumb);
        if(fir == null) {
        out.println("FIR record not found");
        }
        else {
            out.println("Assign investigator");
            String invName = sc.next();
            fir.setFIRAssignInvestigator(invName);
            session.update(fir);
        }
        tx.commit();
        out.println(fir.getFIRNo()+" "+fir.getFIRName()+" "+fir.getFIRAssignInvestigator());
        session.close();
    }
}
