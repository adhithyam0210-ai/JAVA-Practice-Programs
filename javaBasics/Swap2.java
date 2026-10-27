//  Swap without Temp Variable
// Practice Problem: Write a program that swaps the values of two integer variables without using a third temporary variable, relying only on arithmetic operations.

// Exercise Purpose: To explore an alternative swapping technique that uses addition and subtraction instead of extra memory, deepening understanding of how arithmetic can manipulate variable state.

// Given Input: a = 5, b = 10

// Expected Output:

// Before swap: a = 5, b = 10
// After swap:  a = 10, b = 5


class Swap2{
    public static void main(String[] args) {
        int a = 74, b = 37;
        System.out.println("Before Swap : a = " + a + " ,B = "+ b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Afterr Swap : a = "+ a+ " ,B = " +b);
    }
}