 package com.ssi;
 import javax.persistence.Entity;
 import javax.persistence.Id;
 import javax.persistence.ManyToOne;
@Entity
public class Locker {
	@Id
	private int lcode;
	private String ltype;
	private int  rent;
 	@ManyToOne
	private Account account;
	public Locker(int lcode, String ltype, int rent) {
		 super();
		this.lcode = lcode;
		this.ltype = ltype;
		this.rent = rent;
	}
	public Locker() {
		super();
	}
	public Locker(int lcode) {
		super();
		this.lcode = lcode;
	}
	public int getLcode() {
		return lcode;
	}
	public void setLcode(int lcode) {
		this.lcode = lcode;
	}
	public String getLtype() {
		return ltype;
	}
	public void setLtype(String ltype) {
		this.ltype = ltype;
	}
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	@Override
	public String toString() {
		return "Locker [lcode=" + lcode + ", ltype=" + ltype + ", rent=" + rent + "]";
	}
	public Locker(int lcode, String ltype, int rent, Account account) {
		super();
		this.lcode = lcode;
		this.ltype = ltype;
		this.rent = rent;
		this.account = account;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	

}
