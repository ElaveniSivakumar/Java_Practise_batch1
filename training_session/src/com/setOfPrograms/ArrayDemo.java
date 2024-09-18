package com.setOfPrograms;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		int arr[] = new int[5];
		arr[0]=10;
		arr[4]=50;
		arr[1]=20;
		arr[2]=300;
		arr[3]=40;
		arr[1]=2000;
		System.out.println(arr.length);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		int[] arr1 = {200,200,200,400,500,900};
		
		for(int num: arr1) {
			System.out.println(num);
			
		}
		System.out.println(arr1.length);
		
		String[] str= {"word","fun","java"};
		
		for(String s : str) {
			System.out.println(s);
		}
		
		
	}
	
	public class Locker{
		public static void main(String[] args) {
			
		
		String[] locker = new String[4];
		locker[0]="ring";
		locker[1]="chain";
		locker[2]="ear ring ";
		locker[3]="braslets";
		
		System.out.println("all the elements");
		for(String s: locker) {
			System.out.println("locker elements: "+s);
		}
		
		for(int i=0;i<locker.length;i++) {
			System.out.println("locker  "+i+" elements are:  "+locker[i]);
		}
		locker[3]="nose pin";
		System.out.println("changed ..."+locker[3]);
		
		for(int i=0;i<locker.length;i++) {
			System.out.println("locker  "+i+" elements are:  "+locker[i]);
		}
		
		}
		
	}
	
	
	
	
	
	
	public class ArraySum {
		public static void main(String[] args) {
			int[] arr = {12,25,54,14,12};
			int sum=0;
			for(int i=0;i<arr.length;i++) {
				sum+=arr[i];
			}
			System.out.println(sum);
		}
		
	}
	
	
	public class primeOrNot{
		public static void main(String[] args) {
			Integer number;
			Boolean isPrime = true;
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the number: ");
			number=sc.nextInt();
			int i =2;
			
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
				System.out.println(number + "  - number is prime number");
			}else {
				System.out.println(number + "  - number is not prime number");
			}
			sc.close();
		}
	}
public class prime{
	public static void main(String[] args) {
		Integer number;
		Boolean isPrime = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		number=sc.nextInt();
		for(int i =2;i<=number;i++) {
			while(number%i==0) {
				isPrime=false;
				break;
			}
		}
		if(number<=1) {
			isPrime=false;
		
		}
		if(isPrime) {
			System.out.println(number + "  - number is prime number");
		}else {
			System.out.println(number + "  - number is not prime number");
		}
		sc.close();
		
	}
}

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] transpose = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class SumOfElementsIn2DArray {
    public static void main(String[] args) {
        int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];
            }
        }
        
        System.out.println("Sum of all elements: " + sum);
    }
}



	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

