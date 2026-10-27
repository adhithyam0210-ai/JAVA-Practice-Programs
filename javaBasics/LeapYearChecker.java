// Leap Year Checker
// Practice Problem: Write a program that reads a year from the user and determines whether it is a leap year.

// Exercise Purpose: To practice combining multiple conditions with && and || operators to implement a real-world rule that has more than one criterion.

// Given Input: year = 2024

// Expected Output: 2024 is a Leap Year

import java.util.Scanner;
class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year : ");
        int year = sc.nextInt();

        boolean isLeap = (year % 4 == 0 && year %100 != 0) || (year % 400 == 0);

        if(isLeap){
            System.out.println(year +" : is a Leap Year ");
        }
        else{
            System.out.println(year +" : is not a Leap Year ");
        }
    }
}