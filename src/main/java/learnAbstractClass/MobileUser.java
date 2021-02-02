package learnAbstractClass;

public abstract class MobileUser {

	//public static void main(String[] args) {      [ FOR ABSTRACT WE DONT NEED TO USE PUBLIC STATIC VOID MAIN] So afterwards we use "abstract" before class
	
	void call () {							// This is an Non Abstract Method. and it has implementation body
		System.out.println("I am trying call from call method");
		
	}
		
	abstract void sendMessage ();		    // This is an Abstract method. Inside the abstract method there will be no implementation. Because there are no body
		
		
		

	}


