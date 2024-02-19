package com.gitProject;


public class PrimeNumbersEx {

	public static void main(String[] args) {
		
		int num=23;
		boolean flag=false;
		
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println("is prime number");
		}
		else {
			System.out.println("not prime number");
		}
	}

}