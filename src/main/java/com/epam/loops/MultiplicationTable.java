package com.epam.loops;

import java.util.Scanner;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint) {
        if (numberTableToPrint <= 0) {
            for (int i = 0; i < 10; i++) {
                int result = numberTableToPrint * i;
                System.out.println(numberTableToPrint + (i+1) + " x " +i+  " = " + result);
            }
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int input = scanner.nextInt();

        MultiplicationTable table = new MultiplicationTable();
        table.printTable(input);
    }
}
