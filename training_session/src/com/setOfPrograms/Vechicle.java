package com.setOfPrograms;

public class Vechicle extends Bike {
	public static void main(String[] args) {
		
		Vechicle vechicle = new Vechicle();
		vechicle.setBrand("royal enfield");
		vechicle.setPrice(200000);
		System.out.println(vechicle.getBrand());
		System.out.println(vechicle.getPrice());
		
		
}
}
