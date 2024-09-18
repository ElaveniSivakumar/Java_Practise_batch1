package com.setOfPrograms;

import java.util.Scanner;

public class DecisionMakingStatement {
	public static void main(String[] args) {
		
	    /*if*/
		System.out.println("_______if_______");
		System.out.println();
		int age1 =20;
		
		if (age1>=18) {
			System.out.println("you are an adult...");
		}
		System.out.println("................................");
		
		/*if- else*/
		System.out.println("_______if-else_______");
		System.out.println();
		int age2=17;
		
		if(age2>=18) {
			System.out.println("you are an adult...");
		}else{
			System.out.println("you are not an adult...");
		}
		
		System.out.println("................................");
		
		/*if-elseif-else*/
		System.out.println("_______if-elseif-else_______");
		System.out.println();
		int score=85;
		
		if(score>=90) {
			System.out.println("Grade: A");
		}else if(score>=80){
			System.out.println("Grade: B");
		}else if(score>=70) {
			System.out.println("Grade: ");
		}else {
			System.out.println("Grade: F");
		}
		
		System.out.println("................................");
		
		/*Nested if*/
		System.out.println("_______Nested if_______");
		System.out.println();
		int age = 20;
		int height = 170;
		int weight = 40;
		if (age >= 18) {
		    if (height >= 160) {
		    	if(weight >=50) {
		                      System.out.println("You are eligible for the ride.");
		    	}else {
		    		System.out.println("You are not in correct weight for the ride.");
		    	}
		    }
		    else {
		        System.out.println("You are not tall enough for the ride.");
		    }
		} else {
		    System.out.println("You are not old enough for the ride.");
		}
		int age0= 4;
		int height0= 120;
		int weight0= 40;
		
		if(age0<=10){
			if(height0<=130) {
				if(weight0<=30) {
					System.out.println(" true");
				}else {
					System.out.println("w false");
				}
			}else {
				System.out.println("h false");
			}
		}else {
			System.out.println(" a false");
		}
		System.out.println("................................");
		
		/*Switch*/
		System.out.println("_______Switch_______");
		System.out.println();
		int cases = 7;
		int a =20;
		int b=10;
		int value;
		switch (cases) {
		    case 1:
		        value = a+b;
		        break;
		    case 2:
		        value = a-b;
		        break;
		    case 3:
		        value = a*b;
		        break;
		    case 4:
		        value = a/b;
		        break;
		    case 5:
		        value = a%b;
		        break;
		    case 6:
		        value = a&b;
		        break;
		    case 7:
		        value = a|b;
		       
		    default:
		        value = -1;
		        break;
		}
		System.out.println("Value: " + value);
		
		
	
	
	
	}
	
	public class LoopStatement{
		public static void main(String[] args) {
			System.out.println("for............");
			for(int i=10;i>=1;--i) {
				System.out.println("iterated value:  "+i);
			}
			System.out.println("while............");
			int i=0;
			while(i<=5) {
				System.out.println("while loop:  " +i);
				i++;
			}
			
			int j=3;
			do {
				System.out.println("do while loop:  " +j);
				j++;
			}
			while(j<=2);
			
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	public class JumpStatement{
		public static void main(String[] args) {
			for(int i=1;i<=10;i++) {
				if(i==5) {
					break;
				}
				System.out.println("break value:  "+i);
			}
			for(int j=1;j<=10;j++) {
				if(j==5) {
					continue;
				}
				System.out.println("continue value:  "+j);
			}

		}
	}
	
	public class EvenOddNumber{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int N = sc.nextInt();
			int even =0;
			int odd =0;
			for(int i =1;i<=N;i++) {
				if(i%2==0) {
					even++;
				}else {
					odd++;
				}
			}
			System.out.println("even number: "+even);
			System.out.println("odd number: "+odd);
			
			sc.close();
			
			/*Scanner sc = new Scanner(System.in);
			System.out.println("enter the number");
			int N = sc.nextInt();
			if(N%2==1) {
				System.out.println("even:"+N);
			}else {
				System.out.println("odd:"+N);
			}
			sc.close();*/
			
	}
}
	public class GuessTheNumberGame{
		public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
			
			int target =7;
			int userguess=0;
			while(userguess!=target) {
				System.out.println("guess a number between 1 and 10");
				userguess=sc.nextInt();
				if(userguess<target) {
					System.out.println("too low try again");
				}else if(userguess>target) {
					System.out.println("too high try again");
				}else {
					System.out.println("congratulation you guessed the correct number");
				}
			}
			sc.close();
		}
		
	}
	
	public interface Vechicle{
		
	}

}
