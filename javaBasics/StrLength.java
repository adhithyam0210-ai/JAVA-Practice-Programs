// String Length (Manual Count)
// Practice Problem: Write a program that finds the length of a string by iterating through its characters manually, without using the built-in length() method.

// Exercise Purpose: To understand how strings are made up of individual characters that can be accessed one at a time, and to appreciate what the built-in length() method does under the hood.

// Given Input: str = "Hello, World!"

// Expected Output: Length = 13

class StrLength{
    public static void main(String[] args) {
        String name = "My name is Adhi!";
        int count = 0;
        
         
         for(char str : name.toCharArray()){
            count++;
         }
         System.out.println("Count = "+ count );

    }
}