package com.setOfPrograms;

public class Output {
	/*private int no;//variable declaration
	private int num;
	private Demo demo;
	public Output() {}
	 
	
	public Output(int n, int N) {
		this.no=n;
		this.num=N;
	}
	
	
	
	public static void main(String[] args) {
		Output obj1 = new Output();
		obj1.no=1;
		obj1.num=2;
		System.out.println(obj1.no);
		System.out.println(obj1.num);
		
		Output obj2 = new Output(3, 4);
		System.out.println(obj2.no);
		System.out.println(obj2.num);
	}*/
	//static method
	private static void toPrint() {
		System.out.println("hi guyss......");
	}
	// normal method
	//without return type
	private  void toShow() {
		System.out.println("welcome guyss......");
	}
	
	
	//with return type
	private Integer sum(int a,int b) {
	int c =a+b;
	return c;	
	}
	public static void main(String[] args) {
		Output obj = new Output();
		
		obj.toShow();// NM //without return type
		
		
		Output.toPrint(); //SM 
		
		 int d = obj.sum(30, 40); //with return type
	
	System.out.println("Addition number:  "+ d);
		//toPrint(); //SM
		
	
	}
	
	
	
	
	
	

}
