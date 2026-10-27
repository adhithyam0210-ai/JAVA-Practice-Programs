// Find Duplicate Elements
// Practice Problem: Write a program that scans an integer array and prints any elements that appear more than once.

// Exercise Purpose: To practice using nested loops where the inner loop checks every subsequent element against a chosen element in the outer loop, a classic pattern for pairwise comparison.

class FindDuplArray {
    public static void main(String[] args) {
        int [] arr = { 1, 2, 3, 44, 2,3, 2 ,5};
        int i , j;
        int n = arr.length-1;
        for(i = 0; i < n; i++){
            for(j = i + 1; j <= n; j++){
                if(arr[i] == arr[j]){
                    System.out.println("Duplicate Found : "+ arr[j]);
                    break;
                }
            }
        }
    
        
    }
}