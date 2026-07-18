package com.InterfaceExamples;

public class PaymentMain {

	    public static void main(String[] args) {

	        Payment p1 = new CreditCard();
	        p1.pay();

	        Payment p2 = new UPI();
	        p2.pay();

	    }

	}

