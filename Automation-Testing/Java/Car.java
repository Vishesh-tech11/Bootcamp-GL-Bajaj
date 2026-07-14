package com.InheritenceExamples;

public class Car  extends Vehicle{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj = new Car();

		System.out.println("Vehicle Number: " + obj.vehicleNumber);
		System.out.println("Model: " + obj.model);
		System.out.println("Rental Rate Per Day: " + obj.rentalRatePerDay);
		System.out.println("Available: " + obj.isAvailable);	

	}

}
