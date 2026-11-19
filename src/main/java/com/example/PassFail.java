package com.example;

import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks obtained: ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Error: Marks must be between 0 and 100");
        }
        else if (marks >= 50) {
            System.out.println("Result: PASS");
        }
        else {
            System.out.println("Result: FAIL");
        }

        sc.close();
    }
}