// Sum of Natural Numbers Using a While Loop
// Practice Problem: Write a Java program to calculate the sum of the first N natural numbers using a while loop.

// Purpose: This exercise helps you practice the while loop structure and the accumulator pattern, a foundational technique used in iterative algorithms and running totals.

// Given Input: n = 10

// Expected Output: Sum = 55
import java.util.Scanner;
class SumofNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Num : ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;

        while (i <= n) { 
            sum += i;
            i++;
        }
        System.out.println("Sum of "+ n + " is " + sum);
        
    }
}