package com.bl.day5;

public class SwapNumber {
    public static void main(String[] args) {
        float first = 10.0f, second = 23.5f;

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        first = first - second;
        second = first + second;
        first = second - first;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

    }
}
