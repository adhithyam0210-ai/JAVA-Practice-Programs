// Remove Spaces from String
// Practice Problem: Write a program that removes all whitespace characters from a given string and prints the result.
class StringBuild{
    public static void main(String[] args) {
        String str = " my Name is ,Adhi!";
       StringBuilder result = new StringBuilder();

        for(char c : str.toCharArray()){
            if(c != ' '){
                result.append(c);
            }
        }
        System.out.println(result.toString());

    }
}