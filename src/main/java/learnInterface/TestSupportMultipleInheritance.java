package learnInterface;

public class TestSupportMultipleInheritance {

	public static void main(String[] args) {
		
		PracticeThreeClass obj = new PracticeThreeClass() ;        //INTERFACE we cannot create object. But we can create Implementation class for object to call 
		
		obj.cricket();
		obj.running();
		obj.soccer();
		obj.swimming();
		
	}

}
