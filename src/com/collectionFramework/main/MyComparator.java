package com.collectionFramework.main;

import java.util.Comparator;

public class MyComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		if(emp1.getSalary() <  emp2.getSalary()) return -1;
	       if(emp1.getSalary() == emp2.getSalary()) return 0;
	       return 1;
		
	}

}
