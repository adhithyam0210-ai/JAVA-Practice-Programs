// Merge Two Arrays
// Practice Problem: Write a program that merges two separate integer arrays into a single new array and prints all the elements.

// Exercise Purpose: To practice creating an array of a calculated size, copying elements from multiple source arrays using index arithmetic, and understanding how array positions map across boundaries.

class MergeTwoArray{
    public static void main(String[] args) {
        int [] arr1 = {1,2,3};
        int [] arr2 = {4,1,3};
        int [] merged = new int[arr1.length + arr2.length];
        
        for(int i = 0; i< arr1.length; i++){
            merged[i] = arr1[i];
        }
         for(int i = 0; i< arr2.length; i++){
            merged[arr1.length+i] = arr2[i];
        }
                    System.out.println("The Merged Array was ");

        for( int num : merged){
            System.out.print(num +" ");
        }
    }
}