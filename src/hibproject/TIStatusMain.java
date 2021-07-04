/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibproject;

import static java.lang.System.out;
import java.util.Scanner;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Jayshri Dubey
 */
public class TIStatusMain {
    public static void main(String...ar) {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        
        //FIR fir = new (FIR)session.get(FIR.class, FIRNo, FIRName);
        //out.println(fir.getFIRNo()+" "+fir.getFIRName());
        
        out.println("View Status for TI");
        out.println("Enter FIR number to view it's status");
        Scanner sc = new Scanner(System.in);
        int firNumb = sc.nextInt();
        FIR fir = (FIR)session.get(FIR.class, firNumb);
        out.println(fir.getFIRStatus());
        if(fir.getFIRStatus().equalsIgnoreCase("Repeal")){
            try {
                FIR fir1 = (FIR)session.load(FIR.class, firNumb);
                session.delete(fir1);
                tx.commit();
                out.println("FIR deleted from record");
            }
            catch(ObjectNotFoundException ref){
                out.println("FIR record not found");
            }
            catch(Exception ex) {
                out.println("FIR record not found");
            }
        }
        else {
            out.println("You cannot delete FIR record");
        }
    } 
}
