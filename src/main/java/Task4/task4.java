package task4;

import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of side a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the length of side b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the length of side c: ");
        double c = scanner.nextDouble();

        // Check if the given sides can actually form a triangle
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            // Calculating the semi-perimeter (s)
            double s = (a + b + c) / 2.0;

            // Calculating the area using Heron's Formula
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.printf("The area of the triangle is: %.2f%n", area);
        } else {
            System.out.println("Error: The entered lengths cannot form a valid triangle.");
        }

        scanner.close();
    }
}