package learnSelenium;

public class StringConcept01 {

	public static void main(String[] args) {
		
//		*** IN SELENIUM WE USING   EQUAL AND CONTAINS MORE 
		
	// 1.Equals
		
		String text = "String Concept";
		String text1 = "String Concept";
		
		System.out.println(text.equals(text1));			
		
		System.out.println(System.identityHashCode(text));
		System.out.println(System.identityHashCode(text1));
	
		
	// 2.Length
		
		String text2 = "Learning String";
		System.out.println(text2.length());
		
	// 3.Concatenation - Join more than one more String
				
		System.out.println(text.concat(text2));
		System.out.println(text + " " + text2);
		
	
		String num ="20";
		String num1 = "30";
		int a = 10;
		int b = 20;
	
		System.out.println(num + num1);
		System.out.println(num + a);
	
		String firstName ="Masud";
		String lastName = "Ahmed";
	
		System.out.println(firstName + lastName);
		System.out.println(a+b);
		
	// 4. Trim [Removing space]
		
		String line= "  	Java String Concept		";
		System.out.println(line.trim());
		
	//5. toLowerCase()  [Convert all to lower case]
		
		String text4 ="Compares String";
		System.out.println(text4.toLowerCase());
	
	//  toUpperCase () [Convert all to Upper Case]
		
		String text5 ="Compares String";
		System.out.println(text5.toUpperCase());
		
	//6. Contains()  Given String is available in entire string or not - return true/false
		
		String text6 = "compares string";
		System.out.println(text6.contains("mpa"));
		System.out.println(text6.contains("tex"));
		
		
		

	}

}

