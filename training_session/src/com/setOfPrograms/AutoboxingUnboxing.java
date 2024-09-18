package com.setOfPrograms;

import java.util.Scanner;

public class AutoboxingUnboxing {
	public static void add(double num1, double num2) {
		 System.out.println("Addition value: "+ (num1 + num2));
    }

    // Method to subtract two numbers
    public static void subtract(double num1, double num2) {
    	double num3 = num1 - num2;
        System.out.println("Subtraction value: " + num3 );
    }

    // Method to multiply two numbers
    public static void multiply(double num1, double num2) {
    	 System.out.println("Multiplication value: "+ (num1 * num2));
    }

    // Method to divide two numbers
    public static void divide(double num1, double num2) {
        String str = (num2!=0)? "Division value: " + num1/num2:"Error! Division by zero is not allowed.";
    	System.out.println(str);
    }
public static void main(String[] args) {
	/*int a =90,z=23;
	
	Integer i = Integer.valueOf(a);
	
	Integer j = 100;
	int b = j.intValue();
	char k ='A';
	Character c = Character.valueOf(k);
	
	boolean d = true;
	Boolean l = Boolean.valueOf(d);
	System.out.println(l);

	
	
	System.out.println(i);
	System.out.println(j);
	System.out.println(b);	
	System.out.println(a);	*/
	
	// Scanner for user input
    Scanner scanner = new Scanner(System.in);

    // Take input for the first number
    System.out.print("Enter first number: ");
    double num1 = scanner.nextDouble();

    // Take input for the second number
    System.out.print("Enter second number: ");
    double num2 = scanner.nextDouble();
    
    
    add(num1, num2);
    subtract(num1, num2);
    multiply(num1, num2);
    divide(num1, num2);

	
}
}
