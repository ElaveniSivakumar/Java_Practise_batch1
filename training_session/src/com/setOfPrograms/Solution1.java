package com.setOfPrograms;



public class Solution1 implements InterfaceForDemo{

	@Override
	public void dog() {
	System.out.println("dog is pet animal");	
		
	}

	@Override
	public void cat() {
		System.out.println("cat is pet animal");
		
	}
	
	public void animal() {
		System.out.println("list of pet animal i like");
	}
	
	
	public static void main(String[] args) {
		Solution1 obj1 = new Solution1();
		obj1.animal();
		obj1.dog();
		obj1.cat();
		
}
}
