// Write a program that finds and prints both the smallest and the largest elements in an integer array.

// Exercise Purpose: To practice initializing tracker variables to the first element of an array and updating them conditionally as you scan through the remaining elements.

class ArrayMinMax{
    public static void main(String[] args) {
        int [] arr = {10, 75, 35, 6, 44, 25};
        int min = arr[0];
        int max = arr[0];
         for(int i = 0; i <= arr.length-1; i++){
            if(min <= arr[i]){
                min = arr[i];
            }
             if(max >= arr[i]){
                    max = arr[i];
                }
            }
            System.out.println("Max of Array is : "+ max);
            System.out.println("Min of Array is : "+ min);

         }
    }
