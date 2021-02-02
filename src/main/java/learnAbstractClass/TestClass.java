package learnAbstractClass;

public class TestClass {

	public static void main(String[] args) {
		
		MobileUser mu; 				// creating reference variable of super Class
		
		mu = new Rahim();
		mu.sendMessage();
		mu.call();
				
		
		mu = new Karim();
		mu.call();
		mu.sendMessage();
	}

}
