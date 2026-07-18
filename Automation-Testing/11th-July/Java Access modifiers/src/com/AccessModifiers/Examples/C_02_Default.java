package com.AccessModifiers.Examples;

class B {

    int x = 200;
}

public class C_02_Default {

    public static void main(String[] args) {

        B obj = new B();
        int output = obj.x;

        System.out.println("Output is : " + output);
    }
}