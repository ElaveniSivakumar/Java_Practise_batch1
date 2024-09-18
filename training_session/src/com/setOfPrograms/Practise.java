package com.setOfPrograms;

import java.util.Scanner;

public class Practise {
	public static void main(String[] args) {
		Integer number;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:  ");
		number=sc.nextInt();
		Boolean isPrime=true;
		int i=2;
		while(i<=Math.sqrt(number)) {
			if(number%i==0) {
				isPrime=false;
				break;
			}
			i++;
		}
		if(number<=1) {
			isPrime=false;
		}
		if(isPrime) {
			System.out.println(number + " - is not prime");
		}else {
			System.out.println(number + " - is prime");
		}
		
		
	

	}
	
	public class pOrNot{
		public static void main(String[] args) {
			
		
		Integer number;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:  ");
		number=sc.nextInt();
		Boolean isPrime=true;
		
		if(number<=1) {
			isPrime=false;
			
		}else {
		for(int i=2;i<=number;i++) {
			if(number%i==0) {
				isPrime=false;
				break;
			}
		}
		}
		
		if(isPrime) {
			System.out.println(number + " - is not prime");
		}else {
			System.out.println(number + " - is prime");
		}
		
	}
}
	
	public class MethodP{
		static Integer number;
		
		public static void isPrimeorNot(int number,Boolean isPrime){
			if(number<=1) {
				isPrime=false;
				
			}else {
			for(int i=2;i<=number;i++) {
				if(number%i==0) {
					isPrime=false;
					break;
				}
			}
			}
			
			if(isPrime) {
				System.out.println(number + " - is not prime");
			}else {
				System.out.println(number + " - is prime");
			}
			
		}
		public static void main(String[] args) {
			
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the number:  ");
			MethodP.number=sc.nextInt();
			MethodP.isPrimeorNot(number,true);
			sc.close();

		}
	}
	public class Pal{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			String orginalString = sc.nextLine();
			String reverseSting ="";
			for(int i=orginalString.length()-1;i>=0;i--) {
				reverseSting += orginalString.charAt(i); //drow
			}
			if(orginalString.equals(reverseSting)) {
				System.out.println("p");
			}else {
				System.out.println("n p");
			}
		}
	}
	
	public class MaxMinArray {

	    public static void main(String[] args) {
	        // Create Scanner object to take input
	        Scanner scanner = new Scanner(System.in);

	        // Take input for array size
	        System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();

	        // Declare an array of size 'n'
	        int[] arr = new int[n];

	        // Take input for array elements
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        // Initialize min and max variables
	        int min = arr[0];
	        int max = arr[0];
	        

	        // Loop through the array to find max and min
	        for (int i = 1; i < n; i++) {
	            if (arr[i] > max) {
	                max = arr[i];  // Update max
	            }
	            if (arr[i] < min) {
	                min = arr[i];  // Update min
	            }
	            
	        }

	        // Display the maximum and minimum values
	        System.out.println("Maximum value in the array: " + max);
	        System.out.println("Minimum value in the array: " + min);
	        

	        // Close the scanner
	        scanner.close();
	    }
	}
	
	int arr[][]
        = { { 2, 7, 9,6 }, { 3, 6, 1,6 }, { 7, 4, 8,2 }};// 3 rows //4 colums 

	
	
	public class multiDimensional {
	      // main function
	    public static void main(String args[])
	    {
	        // declaring and initializing 2D array
	        int arr[][]
	            = { { 2, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 } };

	        // printing 2D array
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr[i].length; j++) 
	                System.out.print(arr[i][j] + " ");
	            
	            System.out.println();
	         
	        }
	    }
	}
	
	public class MatricSum{
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("enter the row");
			int row=sc.nextInt();
			System.out.println("enter the column");
			int column=sc.nextInt();
			
			
			int[][] arr1= new int[row][column];
			int[][] arr2= new int[row][column];
			int[][] result= new int[row][column];
			System.out.println("enter the elements of array1: ");
			
			for(int i=0;i<row;i++) {
				for(int j=0;j<column;j++) {
					//System.out.print("Element are [ " + i +" ]" +"[ " + j + "]" );
					arr1[i][j]=sc.nextInt();
				}
				//System.out.println();
			}
			System.out.println("enter the elements of array2: ");
			for(int i=0;i<row;i++) {
				for(int j=0;j<column;j++) {
					//System.out.print("Element are [ " + i +" ]" +"[ " + j + "]" );
					arr2[i][j]=sc.nextInt();
				}
				//System.out.println();
			}
			
			for(int i=0;i<row;i++) {
				for(int j=0;j<column;j++) {
					result[i][j]=arr1[i][j]+arr2[i][j];
				}
				}
			
			System.out.println("Final result:    ");
			for(int i=0;i<row;i++) {
				for(int j=0;j<column;j++) {
					System.out.print(" "+ result[i][j]);
					
				}
				System.out.println();
			}
			
		}
	}
	
	public class Pattern{
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("enter the number");
			int n=sc.nextInt();
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print("^");
				}
				System.out.println();
			}
			sc.close();
		}
	}
	public class PatternReverse{
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("enter the number");
			int n=sc.nextInt();
			for(int i=n;i>=1;i--) {
				for(int j=1;j<=i;j++) {
					System.out.print("^");
				}
				System.out.println();
			}
			sc.close();
		}
	}
	
	public class Pattern2 {
		public static void main(String[] args) {
			int n = 10;
			for(int i=1;i<=n;i++) {
				for(int j=i;j<n;j++) {
					System.out.print(" ");
				}
				for(int k=1;k<=(2*i-1);k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}

	}
	
	public class ReversePyramidPattern {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input for the number of rows
	        System.out.print("Enter the number of rows: ");
	        int n = scanner.nextInt();

	        // Print the reverse pyramid pattern
	        for (int i = n; i >= 1; i--) {
	            // Print spaces for the pyramid structure
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }

	            // Print stars
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                System.out.print("*");
	            }

	            // Move to the next line after each row
	            System.out.println();
	        }

	        scanner.close();
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
