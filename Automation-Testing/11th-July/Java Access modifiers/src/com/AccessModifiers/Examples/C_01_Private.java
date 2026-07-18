package com.AccessModifiers.Examples;

class A {

    private int x = 100;

    public int getX() {
        return x;
    }
}

public class C_01_Private {

    public static void main(String[] args) {

        A obj = new A();

        int output = obj.getX();

        System.out.println("Output is : " + output);
    }
}