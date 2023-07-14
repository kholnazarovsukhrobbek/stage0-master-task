package com.epam.conditions;

public class BitwiseValuesSwap {
    public void swap(int first, int second) {
        System.out.println("Before swapping:");
        System.out.println("First: " + first);
        System.out.println("Second: " + second);

        first = first ^ second;
        second = first ^ second;
        first = first ^ second;

        System.out.println("After swapping:");
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
    }
}

