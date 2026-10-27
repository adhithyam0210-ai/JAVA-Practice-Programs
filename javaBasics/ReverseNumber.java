
import java.util.Scanner;

// Reverse a Number
// Practice Problem: Write a program that reads an integer and prints it with its digits in reverse order (e.g., 123 becomes 321).

// Exercise Purpose: To practice extracting individual digits from a number using the modulo and integer division operators inside a while loop.

// Given Input: num = 4892

// Expected Output: Reversed = 2984

class ReverseNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int reversed = 0;

        while(num != 0){
            int digit = num % 10 ;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed Number = " + reversed);

    }

}