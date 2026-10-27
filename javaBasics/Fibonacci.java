
import java.util.Scanner;

// Write a program that reads a number n from the user and prints the first n terms of the Fibonacci series.

// Exercise Purpose: To practice maintaining and updating multiple variables inside a loop to produce a sequence where each term depends on the two that came before it.


public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number");
        int n = sc.nextInt();
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}