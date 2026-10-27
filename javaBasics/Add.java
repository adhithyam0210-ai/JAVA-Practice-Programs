// Practice Problem: Write a program that takes two numbers as input and prints their sum.

// Exercise Purpose: To practice reading user input with the Scanner class and performing basic arithmetic operations in Java.

// Given Input: a = 12, b = 28

// Expected Output: Sum = 40

import java.util.Scanner;
class Add{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :");
       int a = sc.nextInt();
        System.out.print("Enter Number :");
        int b = sc.nextInt();
        int sum = a + b;
       System.out.println(sum + " : is the Output");
       


    }
}
