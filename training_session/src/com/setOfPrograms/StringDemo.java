package com.setOfPrograms;

import java.util.StringTokenizer;

public class StringDemo {
	String name;
	String id;
	String age;
	
	public StringDemo(String n, String i) {
		
		this.name = n;
		this.id = i;
	}
	
	public String toString() {
		
		return "id: " +id +",name: " +name+",Age: "+age;
	}
	
	public void display() {
		System.out.println(id);
		System.out.println(name);
	}


	public static void main(String[] args) {
		
		StringDemo qqqq = new StringDemo("veni", "1"); // to string method call 
		System.out.println(qqqq);
		qqqq.display();
		
		
		
		StringDemo demo= new StringDemo("bbb", "1");
		
		System.out.println(demo);
		
		String s1 ="Hello";
		System.out.println(s1.hashCode());
		String s3="Hello";
		System.out.println(s3.hashCode());
		
		String s2 =" world!";
		
		System.out.println(s2.hashCode());
		System.out.println(s1);
		
		s1.concat(s2);
		
		//s1+=s2;
		
		String newObj = s1.concat(s2);
		System.out.println(newObj);
		System.out.println("after concat : "+ s1);
		
		String obj = new String("hello world");
		System.out.println(obj);
		String nobj = new String(" Java is a fun language ");
		
		
		String o = "nope";
		System.out.println(nobj.contains(o));
		System.out.println(nobj.indexOf("a"));
		System.out.println(nobj.lastIndexOf("g"));
		System.out.println(nobj.length());
		System.out.println(nobj.charAt(2));
		System.out.println(nobj.replace('f', 'g'));
		System.out.println(nobj.substring(14));
		System.out.println(nobj.subSequence(5, 14));
		
	
		String s = "Hello";
		String g = "hello";
		System.out.println(g.compareToIgnoreCase(s));
		
		StringTokenizer token = new StringTokenizer(nobj);
		while(token.hasMoreTokens()) {
			
			System.out.println("spilt it into the token: "+token.nextToken());
		}
			
	}
	
	
	
	public class StringBufferDemo{
		public static void main(String[] args) {
			
			StringBuffer sb1 = new StringBuffer();// default size 16
			System.out.println("default size--> "+sb1.capacity());
			System.out.println();
			System.out.println(sb1.hashCode());
			//formula : (old captity * 2)+2
			//formula : old captity +2
			StringBuffer sb = new StringBuffer(" Java is interesting");
			System.out.println("orginal: "+sb);
			
			
			System.out.println("after declaring the sentence --> "+sb.capacity());
			System.out.println();
			
			System.out.println("Addding the text--> "+sb.append(" and fun"));
			System.out.println("after changing: "+sb);
			System.out.println();
			
			System.out.println("insert the text--> "+sb.insert(0, "The"));
			System.out.println();
			
			System.out.println("replace the sentences--> "+sb.replace(0, 3, "A"));
			System.out.println();
			
			System.out.println("delete the sentences--> "+sb.delete(0, 2));
			
			System.out.println();
			System.out.println("reverse-->"+sb.reverse());
			
			
		}
	}

	public class word{
		public static void main(String[] args) {
			String s = new String("i like coding");
			String d = " and programming";
			String e= "i";
			System.out.println(s.concat("..."));
			System.out.println(s.concat(d));
			System.out.println(s);
			System.out.println(s.contains("i"));
		}
	}
}
