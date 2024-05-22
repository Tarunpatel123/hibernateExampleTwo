package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CardSearch {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Transaction tr=session.beginTransaction();
		   Card cd= session.get(Card.class, "112");
		System.out.println(cd.getCno());
		System.out.println(cd.getCtype());
		   System.out.println(cd.getAccount());
	}

}
