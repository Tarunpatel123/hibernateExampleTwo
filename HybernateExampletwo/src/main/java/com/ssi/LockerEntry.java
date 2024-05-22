package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class LockerEntry {

	public static void main(String[] args) {
		 Session session=Utility.getSessionFactory().openSession();
         Transaction tr=session.beginTransaction();
         session.save(new Locker(1001,"small",4000,new Account(2002)));
         session.save(new Locker(1002,"madium",4000,new Account(2003)));
         session.save(new Locker(1003,"larger",4000,new Account(2004)));
       
         tr.commit();
         System.out.println("storted.......");
         session.close();    

	}

}
