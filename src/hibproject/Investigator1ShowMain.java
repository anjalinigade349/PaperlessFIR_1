
package hibproject;

import static java.lang.System.out;
import org.hibernate.Criteria;
//import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.util.List;

/**
 *
 * @author Jayshri Dubey
 */
public class Investigator1ShowMain {
    public static void main(String...ar) {
        SessionFactory sf = ConnectionFactory.emergencyConnection();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        
        out.println("Showing assigned FIRs for Investigator-1");
        //Query query = session.createQuery("from FIR");
        Criteria crit = session.createCriteria(FIR.class);
        crit.setFirstResult(1);
        crit.setMaxResults(3);
        List<FIR> list = crit.list();
        if(list.isEmpty()) {
            out.println("No record found");
        }
        else {
            for(FIR fir : list) {
                out.println(fir.getFIRNo()+" "+fir.getFIRName());
            }
        }
    }
}
