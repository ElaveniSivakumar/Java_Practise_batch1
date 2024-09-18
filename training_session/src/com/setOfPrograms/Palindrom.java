package com.setOfPrograms;

import java.util.Scanner;

public class Palindrom {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string:  ");
		String orginialSting = sc.nextLine();
		String reverseString = new StringBuffer(orginialSting).reverse().toString();
		
		if(orginialSting.equals(reverseString)) {
			System.out.println("palindrom");
		}else {
			System.out.println("not palindrom");
		}
	}
	

}
