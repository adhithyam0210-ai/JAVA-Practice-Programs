// Bubble Sort
// Practice Problem: Write a program that sorts an integer array in ascending order using the Bubble Sort algorithm and prints the sorted result.

// Exercise Purpose: To understand how nested loops can be used to repeatedly compare adjacent elements and bubble the largest unsorted value to its correct position, one pass at a time.

// Given Input: arr = {64, 34, 25, 12, 22, 11, 90}

// Expected Output: 11 12 22 25 34 64 90

class BubbleSortArray{
    public static void main(String[] args) {
        int [] arr= { 10, 13, 45, 7, 6, 27};

        int n = arr.length-1;
        for(int i = 0; i <= n ; i++){
            for( int j = 0; j < n - i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }
            }
        }
            for(int num : arr){
                System.out.print(num +" ");
            }


    
    }
}