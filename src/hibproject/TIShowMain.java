
package hibproject;

import static java.lang.System.out;
import org.hibernate.Criteria;
//import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.util.List;
import org.hibernate.criterion.Order;

/**
 *
 * @author Jayshri Dubey
 */
public class TIShowMain {
    public static void main(String...ar) {
        SessionFactory sf = ConnectionFactory.emergencyConnection();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        
        out.println("Showing all FIRs for TI");
        //Query query = session.createQuery("from FIR");
        Criteria crit = session.createCriteria(FIR.class);
        crit.addOrder(Order.desc("FIRNo"));
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
