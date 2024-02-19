package com.gitProject;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("MG");
		cars.add("BMW");
		cars.add("I20");
		cars.add("CRETA");
		System.out.println(cars);
		
		
		System.out.println(cars.get(0));
		cars.set(2, "nios");
	//	Collections.sort(cars);
	//	System.out.println("Size of arraylist"+cars.size());
		
		
		
		for(int i=0;i<cars.size();i++) {
			System.out.println(cars.get(i));
			
		}
		for(String i:cars){
			System.out.println(i);
		}
		cars.clear();
		System.out.println(cars);
		
		
		

	}

}
