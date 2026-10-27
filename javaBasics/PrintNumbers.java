// Print Numbers 1 to 100
// Practice Problem: Write a program that prints all integers from 1 to 100 on a single line, separated by spaces.

// Exercise Purpose: To learn the fundamental syntax and control flow of a for loop, including loop initialization, the exit condition, and the increment step.

// Given Input: (None)

// Expected Output: 1 2 3 4 5 ... 98 99 100

import java.util.Scanner;
class PrintNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.print(i+ " ");

        }
    }
}