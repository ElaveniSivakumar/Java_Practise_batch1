package com.setOfPrograms;

public class Demo {
	public String studentName;
	 private static int studentNO;
	 public final static String schoolName="sastra";
	Output output;
	
	static {
		studentNO=111;
	}
	//method
	public void setStudentName(String sName) {
		this.studentName=sName;
	}
	
	public String getStudentName() {
		return this.studentName;
	}
	//Default Constructor
	public Demo(){
	}
	
	/*public Demo() {
		studentName="gokul";
		studentNO=111;
		
	}*/
	//user define constructor
	public Demo(String sName,int sNo) {
		this.studentName=sName;
		this.studentNO=sNo;
	}
	public static void toPrint() {
		
		System.out.println("welcome to java");
	}
	
	public static void main(String[] args) {
Integer no = new Integer(1);
System.out.println(no.getClass());
		//toPrint();
		
		Demo object1 = new Demo();
		Demo.studentNO=1;
		object1.studentName="elaveni";
		object1.studentNO=222;
		System.out.println("Name: " + object1.studentName);
		System.out.println("Roll No: " + object1.studentNO);
		//---------------------------------------------------------
		Demo object2 = new Demo("ajay", 333);
		System.out.println("name: "+object2.studentName+"; "+"roll no: "+object2.studentNO);
		//----------------------------------------------------------
		
		object1.setStudentName("alice");
		System.out.println(object1.getStudentName());
		
		
		
	}
}
