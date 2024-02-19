package com.gitProject;

class Area{
	public int add(int a,int b) {
		return a+b;
		
	}
	public int add(int a,int b, int c) {
		return a+b+c;
		
	}
	
}


public class MethdOvrLdng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Area a= new Area();
		
		System.out.println(a.add(4,5));
		System.out.println(a.add(4,5,6));
		

	}

}
