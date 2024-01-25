package com.anp6589;

public class EvenNumbers {
	//using for loop to print even numbers from 1-50
	void forloop() {
		System.out.println("For loop:");
		for(int i=2;i<=50;i+=2) {
			System.out.println(i);
		}
		System.out.println("============");
	}
	//using while loop to print even numbers from 1-50
	void whileloop() {
		System.out.println("While loop:");
		int i=2;
		while(i<=50) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("============");
	}
	//using dowhile loop to print even numbers from 1-50
	void dowhileloop() 
	{
		System.out.println("dowhile loop:");
		int i=2;
		do {
			System.out.println(i);
			i+=2;
		}while(i<=50);
	}
	public static void main(String[] args) {
		EvenNumbers obj=new EvenNumbers();//Creating an obj
		obj.forloop();//calling forloop method
		obj.whileloop();//calling whileloop method
		obj.dowhileloop();//calling dowhileloop method
	}
}
//o/p:For loop:
/*2
4
6
8
10
12
14
16
18
20
22
24
26
28
30
32
34
36
38
40
42
44
46
48
50
============
While loop:
2
4
6
8
10
12
14
16
18
20
22
24
26
28
30
32
34
36
38
40
42
44
46
48
50
============
dowhile loop:
2
4
6
8
10
12
14
16
18
20
22
24
26
28
30
32
34
36
38
40
42
44
46
48
50*/


