package com.anp6589;

public class Student {
	private String studentName;
	private static String collegeName="St.Mary's Engineering College";
	private int studentid;
	
	public static void main(String[] args) {
		Student sd=new Student();
		sd.studentName="Supriya";
		sd.studentid=501;
		
		System.out.println("studentName:"+sd.studentName);
		System.out.println("studentid:"+sd.studentid);
		System.out.println("collegeName:"+collegeName);
		
		System.out.println("Successful");
	}
}
