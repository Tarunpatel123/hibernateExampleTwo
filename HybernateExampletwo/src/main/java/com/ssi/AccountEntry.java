package com.ssi;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AccountEntry {

	public static void main(String[] args) {
          Session session=Utility.getSessionFactory().openSession();
          Transaction tr=session.beginTransaction();
        /*  List<Locker> list1=new ArrayList<Locker>();
          list1.add(new Locker(1001));
          list1.add(new Locker(1002));
          
          List<Locker> list2=new ArrayList<Locker>();
          list2.add(new Locker(1003));
          list2.add(new Locker(1004));
          
          
          List<Locker> list3=new ArrayList<Locker>();
          list3.add(new Locker(1005));
          list3.add(new Locker(1006));*/
          
          Account ac1=new Account(2002,"tarun patel",20111100,new Card("111"));
          Account ac2=new Account(2003,"hk patel",20111100,new Card("112"));
          Account ac3=new Account(2004,"chman patel",20111100,new Card("113"));
       
          session.save(ac1);
          session.save(ac2);
          session.save(ac3);
         
          
          
          tr.commit();
          
          System.out.println("Storded.......");
          session.close();
          }

}
