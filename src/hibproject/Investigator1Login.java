/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibproject;

import static java.lang.System.in;
import static java.lang.System.out;
import java.util.List;
import java.util.Scanner;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Investigator1Login {
    public static void main(String...ar) {
        SessionFactory sf = ConnectionFactory.emergencyConnection();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        Criteria crit = session.createCriteria(Investigator1.class);
        List<Investigator1> list = crit.list();
        for(Investigator1 inv1 : list) {
        out.println(inv1.getInv1Pwd());
        Scanner sc = new Scanner(in);
        out.println("Enter ID");
        String inv1ID = sc.next();
        out.println("Enter Password");
        String inv1Pwd = sc.next();
        
        if(inv1ID.equals(inv1.getInv1ID()) && inv1Pwd.equals(inv1.getInv1Pwd())){
            out.println("Success!!!!!!!!!");
        }
        }
    }
    }
