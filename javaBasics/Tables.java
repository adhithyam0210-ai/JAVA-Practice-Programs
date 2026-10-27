// Multiplication Table
// Practice Problem: Write a program that reads a number from the user and prints its multiplication table from 1 to 10.


// Exercise Purpose: To practice looping through a fixed range and using the loop counter as a multiplier in a formatted output statement.
import java.util.Scanner;
class Tables{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
         for(int i = 1; i<=10; i++){
           int product = num * i;
           System.out.println(num + " * " +i+ " = "+ product);
         }
    }
}