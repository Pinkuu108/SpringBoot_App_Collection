package com.lb.entity;

public class User {

	
	private Integer idd;
	private String name;
	public Integer getIdd() {
		return idd;
	}
	public void setIdd(Integer idd) {
		this.idd = idd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [idd=" + idd + ", name=" + name + "]";
	}
	
	
	
}
