package learnSelenium;

public class IfElse_Practice {

	public static void main(String[] args) {
	
	/*	if (30>25) {
			System.out.println("30 is greater than 25");
			System.out.println("---------------------");
		} */
		
/*	int x = 20;
	int y = 15;

	if (x > y) {
		System.out.println("x is greater than y");
	}
	else {
		System.out.println("y is smaller than x");
	} */
	int D = 6;
	
	if (D > 6) {
		System.out.println("Diabetic");
	}else if(D < 6) {
		System.out.println("Non Diabetic");
	}else if(D > 7) {
		System.out.println("Poor control");
	}else if(D < 4) {
		System.out.println("NOt poro control");
	}else {
		System.out.println("Pro Diabetic");
	}
	
	System.out.println("-----------------------------");	
	
	
	String browser1 = "Chrome";
	String browser2 = "Firefox";
	String browser3 = "IE";
	
	if (browser1.equals("gecko")) {
		System.out.println("Chrome");
	}else if(browser2.equals("Firefox")) {
		System.out.println("Firefox");
	}else if(browser3.equals("IE")) { 
		System.out.println("IE");
		
	}
	
	
	   
		}
		
	}


