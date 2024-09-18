package com.setOfPrograms;

public class DemoEH{
	
	public static void exceptionHandling(int number1, int number2) throws CustomException{
		System.out.println("div value   ->  "+(number1/number2));
		
	}
public static void main(String[] args){
	try {
		exceptionHandling(10, 5);
	} catch (CustomException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
	
	
		
		
		
	
	
}
}
