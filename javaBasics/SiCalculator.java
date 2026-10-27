// Simple Interest Calculator
// Practice Problem: Write a program that calculates simple interest given a principal amount, an annual interest rate, and a time period in years.

// Exercise Purpose: To practice working with double (decimal) variables and applying a real-world mathematical formula in code.

// Given Input: principal = 1000.0, rate = 5.0, time = 3

// Expected Output: Simple Interest = 150.0

import java.util.Scanner;
class SiCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal Amount : ");
        double principal = sc.nextDouble();
        System.out.print("Enter the Annual Interest Rate : ");
        double rate = sc.nextDouble();
        System.out.print("Enter the Number of Years : ");
        double years = sc.nextDouble();

        double simpleinterest = (principal * rate * years) / 100 ;

        System.out.println("The Simple Interest of the Given Details is : " + simpleinterest);

    }
}