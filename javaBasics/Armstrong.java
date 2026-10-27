
import java.util.Scanner;

// Armstrong Number Checker
// Practice Problem: Write a program that checks whether a given number is an Armstrong number. A number is Armstrong if the sum of its digits each raised to the power of the total number of digits equals the number itself (e.g., 153 = 1³ + 5³ + 3³).

// Exercise Purpose: To combine digit extraction from a while loop with Math.pow(), and to practice counting digits before using that count in a calculation.
 class Armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int digit = String.valueOf(num).length();
        int temp = num;
        int sum = 0;

        while(temp != 0){
           int digits = temp % 10;
            sum = sum + (int)Math.pow(digits,digit);
            temp /= 10;
        }
        if(sum == num){
            System.out.println(num + " is Armstrong number");
        }
        else{
            System.out.println(num + " is not an Armstrong number");
        }
    }
 }