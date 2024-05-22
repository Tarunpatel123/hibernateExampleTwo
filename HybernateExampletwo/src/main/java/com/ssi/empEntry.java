package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class empEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Session session=Utility.getSessionFactory().openSession();
      Transaction tr=session.beginTransaction();
      emp employe=new emp(11,"pooja",new laptop(11,"hp","40000"));
      session.persist(employe);
      tr.commit();
      session.close();
	}

}
