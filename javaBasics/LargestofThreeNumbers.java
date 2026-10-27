// Largest of Three Numbers
// Practice Problem: Write a program that reads three integers from the user and prints the largest among them.

// Exercise Purpose: To practice chaining if-else if-else conditions to compare multiple values and identify an extremum.

// Given Input: a = 14, b = 37, c = 22

// Expected Output: Largest = 37

import java.util.Scanner;
class LargestofThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number A : ");
        int a = sc.nextInt();
        System.out.println("Enter number B : ");
        int b = sc.nextInt();
        System.out.println("Enter number C : ");
        int c = sc.nextInt();

        if(a >= b && a >= c){
            System.out.println(a +" A is Greater");
        }
        else if(b >= a && b >= c){
             System.out.println(b +" B is Greater");
        }
        else{
            System.out.println(c +" C is Greater");
        }


        }
}