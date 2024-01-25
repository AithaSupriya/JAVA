package com.anp6589;

public class Employee {
	int id,age;
	String name;
	boolean ispermanent;
	
	public static void main(String[] args) {
		Employee em=new Employee();
		em.id=123;
		em.age=21;
		em.name="Supriya";
		em.ispermanent=true;
		
		System.out.println("id:"+em.id);
		System.out.println("age:"+em.age);
		System.out.println("name:"+em.name);
		System.out.println("ispermanent:"+em.ispermanent);
		System.out.println("successfully started");
	}
}
