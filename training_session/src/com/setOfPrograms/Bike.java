package com.setOfPrograms;

public class Bike extends Car {
private String brand;
private Integer price;

/*//default constructor
public Bike() {
	
}
public Bike(String brand, Integer price) {
	this.brand = brand;
	this.price = price;
}*/
// set and get method
public Integer getPrice() {
	return price;
}
public void setPrice(Integer p) {
	this.price = p;
}
public void setBrand(String b) {
	this.brand=b;
}

public String getBrand() {
	return brand;
}

public static void main(String[] args) {
	// without creating the get and set method
	Bike bike1 = new Bike();
	bike1.brand="RE";
	bike1.price=200000;
	System.out.println("Brand:"+bike1.brand +"Price:"+bike1.price);
	System.out.println(10+12);
	
	Bike bike = new Bike();
	
	
	bike.setBrand("royal enfield");
	System.out.println("BIKE BRAND: "+bike.getBrand());
	
}


}
