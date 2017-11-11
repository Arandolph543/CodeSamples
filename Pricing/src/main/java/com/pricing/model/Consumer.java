package com.pricing.model;

public class Consumer {
	private int age;
	private String illness; 
	private String name;
	private String sex;
		
	public Consumer() {
		this.age = 0;
		this.illness = null;
		this.name = null;
		this.sex = null;
	}
	
	public Consumer(int age, String illness, String name, String sex) {
		setAge(age);
		setIllness(illness);
		setName(name);
		setSex(sex);
	}
	
	public int getAge() {
		return age;
	}
		
	public String getIllness() {
		return illness;
	}
	
	public String getName() {
		return name;
	}
		
	public String getSex() {
		return sex;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setIllness(String illness) {
		this.illness = illness;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}	
}
