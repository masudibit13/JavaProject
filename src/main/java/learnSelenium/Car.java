package learnSelenium;

public class Car {												// Class name always start with capital letter

	public static void main(String[] args) {                    // Main Method always has static. Method call two type, static and non static
																// Static always has static key word
																// Non static has no key word
		
		//Syntax of object creation
		//Classname obj = new Classname();
		Car obj = new Car();
		
		obj.carDriving();
		obj.carBrake();
		obj.carAC();
		obj.carHorn();			
			
		//A Method has four things
		//  public     - Access Modifier
		//  void       - return type							// It means there are no return
		//  private    - Method name
		//{ System.out.println("I am driving") } Body
	
	}

	public void carDriving() {										// Everyone can access of it
		System.out.println(" - I am a professional license Driver");

	}
	
	 void carHorn () {											// If there is no Modifier it will be automatically consider as default modifier
		System.out.println(" - My car horn has a louder noise");
	}
	
	private void carBrake() {									//private access modifier - no modifier within package
		System.out.println(" - My car has hydrolic break");
	}
	
	protected  void carAC  () {									// protected access modifier within class and package
		System.out.println(" - Car has a stunnning AC power");
	}
	
	/*
	public int multNum (int A,int B) {             // Return type will be int					"JUST FOR EXAMPLE. WE WILL TOUCH THEM LATER"
		System.out.println(A);
		System.out.println(B);
	}
	
	public int addTwoNum(String Password) {         // Return type will be String as Password
		System.out.println(Password));
	} */
	
	
	
}
