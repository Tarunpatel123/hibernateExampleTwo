package com.ssi;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class emp {
	@Id
 private int id;
 private String name;
 @OneToOne (cascade =CascadeType.PERSIST)
 private laptop lap;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public emp(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public emp() {
	super();
}
public emp(int id, String name, laptop lap) {
	super();
	this.id = id;
	this.name = name;
	this.lap = lap;
}
 
}
