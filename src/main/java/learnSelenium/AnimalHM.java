package learnSelenium;

public class AnimalHM {

	public static void main(String[] args) {
		
		AnimalHM life = new AnimalHM ();
		
		life.animalCow();
		life.animalFinance();
		life.animalsecurity();
		
		
		}
	
	public void animalCow () {
		System.out.println("I have a Five Cow");
	}
	
	private void animalFinance () {
		System.out.println("last year revenue trunover increases 10%");
	}
	
	/*default animalTrash () {
		System.out.println("Everyday trash need to taken away from designaed area");
	}*/

	protected void animalsecurity ( ) {
		System.out.println("My private firm is heavily secured by CCTV camera");
	}
	
}


