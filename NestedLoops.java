package com.anp6589;

public class NestedLoops {
	void breakcontinue() {
		for(int i=2;i<=10;i+=2)
		{
			for(int j=1;j<=20;j++)
			{	
				if(j<11) {
					continue;
				}
				System.out.println(i+" *" +j+  " = "+(i*j));	
			}
			if(i==2) {
				break;
				}
		}
	}
		public static void main(String[] args) {
		NestedLoops NL=new NestedLoops();
		NL.breakcontinue();

	}
}

/*0/p:
	2 *11 = 22
	2 *12 = 24
	2 *13 = 26
	2 *14 = 28
	2 *15 = 30
	2 *16 = 32
	2 *17 = 34
	2 *18 = 36
	2 *19 = 38
	2 *20 = 40*/
	
