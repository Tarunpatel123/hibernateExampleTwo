 package com.ssi;
 import java.util.List;

import javax.persistence.Entity;
 import javax.persistence.Id;
 import javax.persistence.ManyToMany;
    @Entity
    public class Nominee {
  	@Id
	private int ncode;
	private String nname;
	private int age;
	@ManyToMany
	private List<Account> account;
	public int getNcode() {
		return ncode;
	}
	public void setNcode(int ncode) {
		this.ncode = ncode;
	}
	public String getNname() {
		return nname;
	}
	public void setNname(String nname) {
		this.nname = nname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Nominee(int ncode, String nname, int age) {
		super();
		this.ncode = ncode;
		this.nname = nname;
		this.age = age;
	}
	public Nominee() {
		super();
	}
	@Override
	public String toString() {
		return "Nominee [account=" + account + "]";
	}
	public Nominee(int ncode) {
		super();
		this.ncode = ncode;
	}
	public Nominee(int ncode, String nname, int age, List<Account> account) {
		super();
		this.ncode = ncode;
		this.nname = nname;
		this.age = age;
		this.account = account;
	}
	public List<Account> getAccount() {
		return account;
	}
	public void setAccount(List<Account> account) {
		this.account = account;
	}
	  
}
