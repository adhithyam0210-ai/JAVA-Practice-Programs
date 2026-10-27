// Sum of Digits
// Practice Problem: Write a program that reads an integer and prints the sum of all its individual digits (e.g., 493 gives 4 + 9 + 3 = 16).


// Exercise Purpose: To reinforce the digit-extraction technique from the previous exercise, this time accumulating a running total instead of building a new number.

// Given Input: num = 4931

// Expected Output: Sum of digits = 17
import java.util.Scanner;
class SumofDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;

        while(temp != 0){
           int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
        System.out.println("Sum of Digits Of " +num+ " is "+ sum );
    }
}