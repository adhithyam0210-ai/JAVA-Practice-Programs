// Practice Problem: Write a program that swaps the values of two variables using a third temporary variable and prints the result.

// Exercise Purpose: To understand how data is stored in variables and how a temporary holding variable can be used to exchange values between two variables without losing data.

// Given Input: a = 5, b = 10

// Expected Output:

// Before swap: a = 5, b = 10
// After swap:  a = 10, b = 5



class Swap{
    public static void main(String[] args) {
        int a = 15;
        int b = 20;
        System.out.println("Before Swap : a = "+ a + " b = "+ b );
        int temp = a ;
        a = b;
        b = temp;
        System.out.println("After Swap : a = " + a + " b = " + b);

    }
}