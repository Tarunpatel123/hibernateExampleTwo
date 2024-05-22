package com.ssi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class laptop {
	@Id
  private int lcode;
  private String lname;
  private String lprice;
  
public laptop(int lcode, String lname, String lprice) {
	super();
	this.lcode = lcode;
	this.lname = lname;
	this.lprice = lprice;
}
public laptop() {
	super();
}
@Override
public String toString() {
	return "laptop [lcode=" + lcode + ", lname=" + lname + ", lprice=" + lprice + "]";
}
public int getLcode() {
	return lcode;
}
public void setLcode(int lcode) {
	this.lcode = lcode;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getLprice() {
	return lprice;
}
public void setLprice(String lprice) {
	this.lprice = lprice;
}
public laptop(int lcode, String lname, String lprice, emp employe) {
	super();
	this.lcode = lcode;
	this.lname = lname;
	this.lprice = lprice;
	
}
  

}
