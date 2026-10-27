//  Even or Odd Checker
// Practice Problem: Write a program that reads an integer from the user and prints whether it is even or odd.

// Exercise Purpose: To learn how to use the modulo operator % and an if-else statement to make a decision based on a condition.

import java.util.Scanner;
class EvenOdd {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        if( num % 2 == 0){
            System.out.println(num + " : is Even Number ");
        }
        else{
            System.out.println(num + " : is Odd Number ");
        }
}
}