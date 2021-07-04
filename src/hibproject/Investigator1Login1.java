
package hibproject;

import static java.lang.System.out;
import org.hibernate.Criteria;
//import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.util.List;
//import org.hibernate.criterion.Order;

/**
 *
 * @author Jayshri Dubey
 */
public class Investigator1Login1 {
    public static void main(String...ar) {
        SessionFactory sf = ConnectionFactory.emergencyConnection();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        //Query query = session.createQuery("from FIR");
        Criteria crit = session.createCriteria(Investigator1.class);
        List<Investigator1> list = crit.list();
        if(list.isEmpty()) {
            out.println("No record found");
        }
        else {
            for(Investigator1 inv1 : list) {
                out.println(inv1.getInv1ID()+" "+inv1.getInv1Pwd());
            }
        }
    }
}
