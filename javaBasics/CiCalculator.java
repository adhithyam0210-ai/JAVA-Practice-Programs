// Compound Interest Calculator
// Practice Problem: Write a program that calculates compound interest given a principal, an annual interest rate, and a number of years.

// Exercise Purpose: To learn how to use Math.pow() from Java’s built-in Math library and to understand the difference between simple and compound growth.

// Given Input: principal = 1000.0, rate = 5.0, time = 3

// Expected Output:

// Amount after interest = 1157.625
// Compound Interest     = 157.625
import java.util.Scanner;
class CiCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal Amount : ");
        double principal = sc.nextDouble();
        System.out.print("Enter the Annual Interest rate : ");
        double rate = sc.nextDouble();
        System.out.print("Enter the number of Years : ");
        double years = sc.nextDouble();

        double A = principal * Math.pow((1 + rate/100), years);
        double CI = A - principal;

        System.out.println("The Compound Interest For the Given Details Was : " + CI);
    }

}