// Square & Cube of a Number
// Practice Problem: Write a program that takes a number as input and prints both its square and its cube.

// Exercise Purpose: To practice performing repeated multiplication on a variable and to get familiar with using Math.pow() as an alternative to manual multiplication.

// Given Input: num = 4

// Expected Output:

// Square of 4 = 16
// Cube of 4   = 64

import java.util.Scanner;
class SquareCube {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        double A = sc.nextDouble();

        
                double square = Math.pow(A, 2);
                double cube = Math.pow(A, 3);

                System.out.println("Square of " + A + " = " + (int) square);
                System.out.println("Cube of " + A + "   = " + (int) cube);
        }
}
