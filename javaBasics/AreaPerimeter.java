// Rectangle Area & Perimeter
// Practice Problem: Write a program that takes the length and width of a rectangle as input and calculates and prints both its area and its perimeter.

// Exercise Purpose: To practice using variables in multiple arithmetic formulas within the same program and to reinforce formatted output with descriptive labels.

// Given Input: length = 8, width = 5

// Expected Output:

// Area      = 40
// Perimeter = 26
import java.util.Scanner;
class AreaPerimeter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the Rectangle :");
        double length = sc.nextDouble();
        System.out.print("Enter the Width of the Rectangle :");
        double width = sc.nextDouble();

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("Area is : " + area);
        System.out.println("Perimeter is : " +perimeter);
    }
}