package com.ssi;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

 @Entity
 public class Account {
	@Id
	private int ano;
	private String aname;
 	private int balance;
	//@OneToOne(fetch = FetchType.LAZY)
	@OneToOne(fetch = FetchType.EAGER)
	private Card card;
    @OneToMany(mappedBy ="account")
	private List<Locker>lokers;
    @ManyToMany (mappedBy ="account")
    private List<Nominee>nominess;
	public List<Nominee> getNominess() {
		return nominess;
	}
	public void setNominess(List<Nominee> nominess) {
		this.nominess = nominess;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	public Account(int ano, String aname, int balance, Card card) {
		super();
		this.ano =ano;
		this.aname = aname;
		this.balance = balance;
		this.card = card;
	}
	public Account() {
		super();
	}
	@Override
	public String toString() {
		return "Account [ano=" + ano + ", aname=" + aname + ", balance=" + balance + ", card=" + card + "]";
	}
	public List<Locker> getLokers() {
		return lokers;
	}
	public void setLokers(List<Locker> lokers) {
		this.lokers = lokers;
	}
	public Account(int ano, String aname, int balance, Card card, List<Locker> lokers) {
		super();
		this.ano = ano;
		this.aname = aname;
		this.balance = balance;
		this.card = card;
		this.lokers = lokers;
	}
	public Account(int ano) {
		super();
		this.ano = ano;
	}
	

}