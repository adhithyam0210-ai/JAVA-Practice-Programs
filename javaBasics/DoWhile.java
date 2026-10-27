//  Print Even Numbers Using a Do-While Loop
// Practice Problem: Write a Java program to print all even numbers from 1 to N using a do-while loop.

// Purpose: This exercise helps you practice the do-while loop structure, which guarantees at least one execution, and reinforces checking even numbers using the modulo operator.

// Given Input: n = 10
import java.util.Scanner;
class DoWhile{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int  i = 1;

        do{
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
            while(i<=n);
        

    }
}