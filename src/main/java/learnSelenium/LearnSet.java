package learnSelenium;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		
	//	Set<Integer> obj = new TreeSet<Integer>() ;
		Set<Integer> obj = new HashSet<Integer>();
	//	Set<Integer> obj = new LinkedHashSet<Integer>();
		
	obj.add(2344);
	obj.add(65486746);
	obj.add(5741);
	obj.add(8974541);
	obj.add(58741);
	obj.add(2574);
	obj.add(2344);
	obj.add(5741);
	
	System.out.println(obj.size());
	
		System.out.println("*****************************************");
	
	for (Integer eachobj : obj) {
		System.out.println(eachobj);
	}
		System.out.println("------------------------------------------");
	
	System.out.println(obj.contains(5741));
	
		System.out.println("-------------------------------------------");
	
	obj.remove(2344);
		
		System.out.println("-------------------------------------------");
	
	for (Integer eachobj : obj) {
		System.out.println(eachobj);
	}
	
	System.out.println(obj.size());
	
	obj.clear();
	System.out.println(obj.isEmpty());
	
	
	

	}

}
