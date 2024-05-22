package com.ssi;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;
public class AccountSearch {

	public static void main(String[] args) {
	    Session session=Utility.getSessionFactory().openSession();
		Transaction tr=session.beginTransaction();
		    Account ac= session.get(Account.class,2003);
		  // System.out.println(ac);	
		   System.out.println(ac.getAno());
		   System.out.println(ac.getAname());
     	   List<Locker> locker= ac.getLokers();
              for(Locker ko:locker)
            {
            	 System.out.println(ko);
            }
	    	tr.commit();
	    	System.out.println("Nominee-----------");
	          List<Nominee>nominess=ac.getNominess();
	         for(Nominee no:nominess )
	        {
	        	System.out.println(no);
	       
	        }
	        	session.close();	

	}
}
