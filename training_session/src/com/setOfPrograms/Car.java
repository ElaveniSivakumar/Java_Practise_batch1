package com.setOfPrograms;
/* Program using user define constructor to set  and get the data */
/**
 * 
 * 
  
 * */
public class Car {
	//variable deceleration
	
private String brand;
private String colour;
private Integer year;
private Integer price;

public String getColour() {
	return colour;
}
public void setColour(String p) {
	this.colour = p;
}
public void setYear(Integer b) {
	this.year=b;
}

public Integer getyear() {
	return year;
}

public Car() {
	
}

//user-define constructor
public Car(String cBrand,String cColour, Integer cYear,Integer cPrice) {
	this.brand=cBrand;
	this.colour=cColour;
	this.year=cYear;
	this.price=cPrice;
}
public void toDisplay() {
	System.out.println("Brand:"+brand);
	System.out.println("Price: $"+price);
	
}
//main method
public static void main(String[] args) {
	//object creation and data initialization
	
	Car obj = new Car();
	
	Car car1 = new Car("bmw", "red", 2021, 1200000);
	Car car2 = new Car("tesla", "white", 2022, 13450000);
	Car car3 = new Car("tata car", "blue", 2023, 5534500);
	
	// printing process
	/*System.out.println("Welcome to Luxury Rides Showroom!\r\n"
			+ "");
	System.out.println("Car 1");
	System.out.println("Brand:"+car1.brand);
	System.out.println("Colour:"+car1.colour);
	System.out.println("Year:"+car1.year);
	System.out.println("Price:$"+car1.price);
	
	System.out.println("Car 2");
	System.out.println("Brand:"+car2.brand);
	System.out.println("Colour:"+car2.colour);
	System.out.println("Year:"+car2.year);
	System.out.println("Price:$"+car2.price);
	
	System.out.println("Car 3");
	System.out.println("Brand:"+car3.brand);
	System.out.println("Colour:"+car3.colour);
	System.out.println("Year:"+car3.year);
	System.out.println("Price:$"+car3.price);*/
	
	car1.toDisplay();
	car2.toDisplay();
	car3.toDisplay();
	
	
}
}
