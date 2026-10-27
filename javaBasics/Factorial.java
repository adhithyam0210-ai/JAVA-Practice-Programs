
import java.util.Scanner;

// Factorial of a Number
// Practice Problem: Write a program that reads a non-negative integer from the user and prints its factorial.

// Exercise Purpose: To practice using a loop to accumulate a running product, and to understand how a result is built up incrementally across multiple iterations.

// Given Input: n = 6

// Expected Output: Factorial of 6 = 720

class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : " );
        int num = sc.nextInt();
        long factorial = 1;

        for(int i = 1; i <= num; i++){
           factorial *= i;

        }
        System.out.println("Factorial of " +num+ " is "+ factorial);
    }
}