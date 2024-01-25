package com.anp6589;

public class ClassCharacterMethods {
	static void CharacterMethods() {
		System.out.println("isLetter method:");
		char ch1='c';
		System.out.println(Character.isLetter(ch1));
		System.out.println("=====================");
		System.out.println("isDigit method:");
		char ch2='3';
		char ch3='a';
		System.out.println(Character.isDigit(ch2));
		System.out.println(Character.isDigit(ch3));
		System.out.println("=====================");
		System.out.println("isWhitespace method:");
		char ch4=' ';
		System.out.println(Character.isWhitespace(ch4));
		System.out.println("=====================");
		System.out.println("isUpperCase method:");
		char ch5='A';
		System.out.println(Character.isUpperCase(ch5));
		System.out.println("=====================");
		System.out.println("isLowerCase method:");
		char ch6='a';
		System.out.println(Character.isLowerCase(ch6));
		System.out.println("=====================");
		System.out.println("toUpperCase method:");
		char ch7='a';
		System.out.println(Character.isLowerCase(ch7));
		System.out.println("=====================");
		System.out.println("toLowerCase method:");
		char ch8='A';
		System.out.println(Character.isLowerCase(ch8));
		System.out.println("=====================");
		System.out.println("toString method:");
		char ch9='c';
		char ch10='4';
		String s=Character.toString(ch9);
		System.out.println(s.getClass().getSimpleName());
	
	}
	public static void main(String[] args) {
	CharacterMethods();
}
}

/* o/p:
isLetter method:
true
=====================
isDigit method:
true
false
=====================
isWhitespace method:
true
=====================
isUpperCase method:
true
=====================
isLowerCase method:
true
=====================
toUpperCase method:
true
=====================
toLowerCase method:
false
=====================
toString method:
String
 */
 
