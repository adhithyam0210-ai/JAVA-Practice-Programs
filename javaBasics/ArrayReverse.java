// Reverse an Array
// Practice Problem: Write a program that reverses the elements of an integer array in place (without creating a second array) and prints the result.

// Exercise Purpose: To apply the temp-variable swap technique from Exercise 2 inside an array context, and to understand how two-pointer indices moving toward each other can process a data structure symmetrically.

class ArrayReverse {
    public static void main(String[] args) {
        int [] arr = {10,5,3,2,1} ;
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for(int num : arr){
            System.out.print(num + " ");
        }

    }
}