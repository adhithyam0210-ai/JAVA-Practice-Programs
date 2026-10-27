// Print Array Elements
// Practice Problem: Write a program that declares and initializes an integer array, then iterates through it and prints each element on a single line separated by spaces.

class PrintArray{
    public static void main(String[] args) {
        int [] arr = { 10, 20, 30, 40, 50};
        for(int i = 0; i <= arr.length-1; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}