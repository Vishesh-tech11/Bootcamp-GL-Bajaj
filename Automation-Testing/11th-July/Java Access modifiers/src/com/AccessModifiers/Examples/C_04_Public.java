package com.AccessModifiers.Examples;

class D {

    public int x = 400;
}

public class C_04_Public {

    public static void main(String[] args) {

        D obj = new D();
        int output = obj.x;

        System.out.println("Output is : " + output);
    }
}