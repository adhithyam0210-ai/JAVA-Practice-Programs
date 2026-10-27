// Array Sum and Average
// Practice Problem: Write a program that calculates and prints both the sum and the average of all elements in an integer array.

// Exercise Purpose: To practice accumulating a running total across an array and performing a final calculation after the loop, while also handling the integer-to-decimal conversion needed for an accurate average.

class ArraySumAvg{
    public static void main(String[] args) {
        int sum = 0;
        int [] arr = { 10, 20, 30, 40, 50, 60};
        for(int i = 0; i <= arr.length-1; i++){
             sum += arr[i];
        }
         double avg = sum / arr.length;
         System.out.println("Sum Of the Array is : " + sum);
         System.out.println("Avg of the Array is : " + avg);
    }
}