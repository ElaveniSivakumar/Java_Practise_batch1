package com.setOfPrograms;

public class Solution extends ClassAbstract{

	

	@Override
	void getName() {
		System.out.println("my name is veni ");
		
	}

	@Override
	void getAge() {
		// TODO Auto-generated method stub
		System.out.println("my age is 23");
		
	}
	
	public static void main(String[] args) {
		Solution obj = new Solution(); 
		
			obj.getName();
			obj.getAge();
	
		
	}
	
	

	
	
	

}
