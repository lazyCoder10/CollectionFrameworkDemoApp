package com.collectionFramework.main;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Set<String> addWords = new HashSet();//type unsafe`
//		addWords.add("I");
//		addWords.add("Came");
//		addWords.add("I");
//		addWords.add("Win");
//		System.out.print(addWords.size()+" disticnt element: ");
//		for(String s : addWords){
//			System.out.print(s+" ");
//		}
//		Set<String> addTree = new TreeSet<String>();//type safe // ordered alphabetically  
//		addTree.add("I");
//		addTree.add("Came");
//		addTree.add("I");
//		addTree.add("Win");
//		System.out.print(addTree.size()+" disticnt element: ");
//		for(String s : addTree ){
//			System.out.print(s+" ");
//		}
//		Set<String> linkedHashSet = new LinkedHashSet<String>();
//		linkedHashSet.add("I");
//		linkedHashSet.add("Came");
//		linkedHashSet.add("I");
//		linkedHashSet.add("Win");
//		System.out.print(linkedHashSet.size()+" disticnt element: ");
//		for(String s : linkedHashSet ){
//			System.out.print(s+" ");
//		}
//		List<String> newList = new ArrayList<String>();
//		newList.add("I");
//		newList.add("Came");
//		newList.add("I");
//		newList.add("Saw");
//		newList.add("I");
//		newList.add("Peed");
//		//Collections.shuffle(newList, new Random());
//		for(String s: newList){
//			System.out.println(s);
//		}
//		//String s1 = "i came i saw i win";
//		//List<String> list2 =  Arrays.asList(s1);
//		//Collections.shuffle(list2);
//		
//		newList.add(newList.indexOf("Saw")+1, "I Peed");
//		System.out.println(newList);
		
		List<Employee> listSorted = new ArrayList<Employee>();
		
		Employee emp1 = new Employee();
		emp1.setEmpName("Abdullah");
		emp1.setAge("25");
		emp1.setSalary(25000.00);
		listSorted.add(emp1);
		Employee emp2 = new Employee();
		emp2.setEmpName("Rahim");
		emp2.setAge("30");
		emp2.setSalary(1000.00);
		listSorted.add(emp2);
		Comparator mycmp = new MyComparator();
		Collections.sort(listSorted, mycmp);
		
		
		
		

	 

}
}