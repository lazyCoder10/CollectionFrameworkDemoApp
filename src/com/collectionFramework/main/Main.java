package com.collectionFramework.main;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> addWords = new HashSet<String>();
		addWords.add("I");
		addWords.add("came");
		addWords.add("I");
		addWords.add("Win");
		System.out.print(addWords.size()+" disticnt element: ");
		for(String s : addWords){
			System.out.print(s+" ");
		}
		

	}

}
