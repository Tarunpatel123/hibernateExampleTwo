package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class LockerSearch {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Transaction tr=session.beginTransaction();
		Locker lk=session.get(Locker.class,1001);
		System.out.println(lk.getLcode());
		System.out.println(lk.getLtype());
		System.out.println(lk.getAccount().getAname());
		System.out.println(lk.getAccount().getAname());
		System.out.println(lk.getAccount().getBalance());
		
	
		
		tr.commit();
		session.close();
	}

}
