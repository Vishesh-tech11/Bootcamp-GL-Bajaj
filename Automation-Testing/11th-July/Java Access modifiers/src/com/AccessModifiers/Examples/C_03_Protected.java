package com.AccessModifiers.Examples;

class C {

    protected int x = 300;
}

public class C_03_Protected {

    public static void main(String[] args) {

        C obj = new C();
        int output = obj.x;

        System.out.println("Output is : " + output);
    }
}
