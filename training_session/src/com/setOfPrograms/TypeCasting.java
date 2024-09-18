package com.setOfPrograms;

public class TypeCasting {
	public String aHolder;
	public String aNo;
	public Double balance;
	
	
	public TypeCasting(String aHolder, String aNo) {
		this.aHolder = aHolder;
		this.aNo = aNo;
		this.balance = 0.0;// default balance
	}


	public TypeCasting(String aHolder, String aNo, Double balance) {
		this.aHolder = aHolder;
		this.aNo = aNo;
		this.balance = balance;
	}
public void deposite(double dAmount) {
	balance +=dAmount;
	System.out.println(dAmount+"deposited.");
}
public void withdraw(double amount) {
	String str=(amount<=balance)?"withdrawn sucessfully":"Insufficent balance";
	System.out.println(str);
}
public void displayAccountInfo() {
	System.out.println("Account Holder: "+aHolder);
	System.out.println("Account Number: "+aNo);
	System.out.println("Balance: "+balance);
}
	public static void main(String[] args) {
		/*int a = 12;
		double b = a; //int to double convert
		System.out.println("before casting:" + a);
		System.out.println("After casting:" + b);
		
		
		double c = 13.123330901d;
		int d = (int)c;
		float e = (float)c;
		
		System.out.println("before casting:" + c);
		System.out.println("After casting:" + d);
		System.out.println("After casting:" + e);*/
		
		TypeCasting obj1 = new TypeCasting("Elaveni","12345678910");
		obj1.deposite(500.0);
		obj1.withdraw(100);
		obj1.displayAccountInfo();
		
		TypeCasting obj2 = new TypeCasting("Mari","10987654321",2000.0);
		obj2.deposite(100);
		obj2.withdraw(2200);
		obj2.displayAccountInfo();
		
		
		
		
		
	}
	

}
