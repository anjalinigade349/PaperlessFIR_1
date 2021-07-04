
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
public class Investigator1Main {
    public static void main(String...ar) {
        Configuration conf = new Configuration();
        Configuration c1 = conf.configure();
        SessionFactory sf;
        sf = c1.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        Scanner sc = new Scanner(System.in);
        
        out.println("Enter ID");
        String inv1Id = sc.next();
        out.println("Enter Password");
        String inv1Pass = sc.next();
        Investigator1 inv1 = new Investigator1(inv1Id, inv1Pass);
        session.save(inv1);
        tx.commit();
        session.close();
        out.println("Success!!!!!!!!!!!!!!");
    }
}
