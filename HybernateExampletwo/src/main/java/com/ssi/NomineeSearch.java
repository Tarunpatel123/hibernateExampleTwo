package com.ssi;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class NomineeSearch {

	public static void main(String[] args) {
	   Session session=Utility.getSessionFactory().openSession();
	   Transaction tr=session.beginTransaction();
	          Nominee no=session.get(Nominee.class,3003);
	           no.getAge();
	           no.getNcode();
	           no.getNname();
	          List<Account>list=no.getAccount();
	          for(Account em:list)
	          {
	          System.out.println(em);
	          }
	          
	    
	      tr.commit();
	      session.close();
	 }

    }
