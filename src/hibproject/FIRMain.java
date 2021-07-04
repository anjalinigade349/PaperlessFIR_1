package hibproject;

import static java.lang.System.out;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;


public class FIRMain {
    public static void main(String...ar) {
        Configuration conf = new Configuration();
        Configuration c1 = conf.configure();
        SessionFactory sf;
        sf = c1.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        Scanner sc = new Scanner(System.in);
        
        Criteria crit = session.createCriteria(FIR.class);
        crit.addOrder(Order.desc("FIRNo"));
        crit.setMaxResults(1);
        List<FIR> list = crit.list();
        if(list.isEmpty()) {
            out.println("No record found");
            int firNoNew = 1;
            
        out.println("New FIR number is :"+ firNoNew);
        out.println("Enter Name");
        String firName = sc.next();
        out.println("Enter Address");
        String firAdd = sc.next();
        out.println("Enter Aadhar number");
        String firAadharNo = sc.next();
        out.println("Enter Contact number");
        String firContactNo = sc.next();
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
        String firtime = sdf.format(date);
        out.println("Enter Statment");
        String firStatment = sc.next();
        FIR fir1 = new FIR(firNoNew,firName,firAdd,firAadharNo, firContactNo, firtime ,firStatment);
        session.save(fir1);
        tx.commit();
        session.close();
        out.println("Success!!!!!!!!!!!!!!");
        out.println("Your FIR number is :"+ firNoNew);
        }
        else {
            for(FIR fir : list) {
            int firNoNew = fir.getFIRNo()+1;
            
        out.println("New FIR number is :"+ firNoNew);
        out.println("Enter Name");
        String firName = sc.next();
        out.println("Enter Address");
        String firAdd = sc.next();
        out.println("Enter Aadhar number");
        String firAadharNo = sc.next();
        out.println("Enter Contact number");
        String firContactNo = sc.next();
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
        String firtime = sdf.format(date);
        out.println("Enter Statment");
        String firStatment = sc.next();
        FIR fir1 = new FIR(firNoNew,firName,firAdd,firAadharNo, firContactNo, firtime ,firStatment);
        session.save(fir1);
        tx.commit();
        session.close();
        out.println("Success!!!!!!!!!!!!!!");
        out.println("Your FIR number is :"+ firNoNew);
    }
  }
 }    
}
