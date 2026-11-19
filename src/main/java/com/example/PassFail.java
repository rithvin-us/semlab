package com.example;

import java.util.Scanner;

public class PassFail {

    public static String getResult(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100");
        }
        return marks >= 50 ? "PASS" : "FAIL";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks obtained: ");
        int marks = sc.nextInt();
        try {
            System.out.println("Result: " + getResult(marks));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
