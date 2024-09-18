package com.setOfPrograms;

public class Operator {
int i=34;
int j=90;
public void add() {
	System.out.println(i+j);
	
}
public Integer sub() {
	int c=i-j;
	System.out.println(c);
	return c;
}

	public static void main(String[] args) {
		Operator obj = new Operator();
		obj.add();
		obj.sub();
		int a=20, b=80;
		boolean c = false;
		//System.out.println(a%b);
		System.out.println(++b);
		System.out.println(--a);
		System.out.println(!c); // != false
		
		
		int z = 10;
		z-=5;
		System.out.println(z);
		
		Integer y = 10;
		//System.out.println( y instanceof Integer);
		
		boolean o=false, p=false;
		System.out.println(o&&p);
		System.out.println(o||p);
		System.out.println(!p);
		
		
		Integer w = 10;
		
		String str = (w>11)?"yes":"no";
		
		
		System.out.println(str);
		
		int u=5, l=8;
		System.out.println(u&l);
		System.out.println(u|l);
		
		
		
		
		
	}
}
