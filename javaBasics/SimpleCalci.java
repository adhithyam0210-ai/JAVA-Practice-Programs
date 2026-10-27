// Simple Calculator Using switch
// Practice Problem: Write a program that reads two numbers and an operator (+, -, *, /) from the user and prints the result of the chosen operation.

// Exercise Purpose: To learn the switch statement as a cleaner alternative to a long chain of if-else if blocks when branching on a single value.

// Given Input: a = 10, b = 4, operator = *

// Expected Output: Result = 40.0

import java.util.Scanner;
class SimpleCalci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number :");
        double num1 = sc.nextDouble();

        System.out.print("Enter Second Number :");
        double num2 = sc.nextDouble();

        System.out.print("Enter the operation (+, -, *, /) :");
        char op = sc.next().charAt(0);
        double result;

        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':

                if(num2 != 0){
                    result = num1 / num2;
                }
                else{
                    System.out.println("Error : Division By Zero");
                    return;
                }
                break;
            default:
                System.out.println("Error : unknown operator");
                return;

    }
    System.out.println("Result = " + result);
    }
}