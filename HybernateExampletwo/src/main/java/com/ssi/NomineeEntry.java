package com.ssi;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

 public class NomineeEntry {

	public static void main(String[] args) {
	  Session session=Utility.getSessionFactory().openSession();
	  Transaction tr=session.beginTransaction();
	     List<Account>l1=new ArrayList<Account>();
	    l1.add(new Account(2002));
	    l1.add(new Account(2003));
	    List<Account>l2=new ArrayList<Account>();
	    l2.add(new Account(2003));
	    l2.add(new Account(2004));
	    List<Account>l3=new ArrayList<Account>();
	    l3.add(new Account(2004));
	    l3.add(new Account(2002));
	    Nominee no1=new Nominee(3003,"utype",21,l1);
	    Nominee no2=new Nominee(3004,"vtype",22,l2);
	    Nominee no3=new Nominee(3005,"xtype",23,l3);
	    session.save(no1);
	    session.save(no2);
	    session.save(no3);
	     tr.commit();
	     System.out.println("Stortedd......");
        session.close();

	}

}

