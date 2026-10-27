//  Palindrme string Checker 
// Practice Problem: Write a program that checks whether a given string reads the same forwards and backwards (i.e., is a palindrome), ignoring case.

// Exercise Purpose: To practice combining string methods such as toLowerCase(), charAt(), and length() with a two-pointer loop to compare characters from opposite ends of a string.

class PalindromeString{
    public static void main(String[]args){
        String str = "Racecar";
        String lower = str.toLowerCase();
        
        boolean ispalin = true;
        int left = 0;
        int right = lower.length() - 1;

        while(left < right){
            if(lower.charAt(left) != lower.charAt(right)){
                ispalin = false;
                break;
            }
            left++;
            right--;

        }
        if(ispalin){
           System.out.println("\"" +str + "\" is a Palindrome");
        }
        else{
           System.out.println(str + " is not a Palindrome");

        }

    }
}