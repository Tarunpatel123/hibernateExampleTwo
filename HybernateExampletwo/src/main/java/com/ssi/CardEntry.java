package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CardEntry {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Transaction tr=session.beginTransaction();
		Card cd1=new Card("111","gold",1234);
		Card cd2=new Card("112","silver",12345);
		Card cd3=new Card("113","patanium",12346);
		session.save(cd1);
		session.save(cd2);
		session.save(cd3);	
		tr.commit();
	    System.out.println("stored.....");
		session.close();

	}

}
