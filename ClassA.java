package multilpleinheritance;
//multiple inheritance is achieved using interfaces
public class ClassA implements Java,Python{
	public void language(){
		System.out.println("Programming Languages:");
	}
	public void java(){
		System.out.println("Java is a Object Oriented Programing language");
	}
	public void python(){
		System.out.println("C is a procedural Programming Language");
	}
	public static void main(String[] args) {
		ClassA lang=new ClassA();
		lang.language();
		//calling methods through interfaces
		lang.java();
		lang.python();
		
	}
}
/*
 o/p:Programming Languages:
	 Java is a Object Oriented Programing language
	 C is a procedural Programming Language
 */
=================================================================================
package multilpleinheritance;

public interface Java {
	void java(); 		
}
=========================================
package multilpleinheritance;

public interface Python {
	void python();
}

