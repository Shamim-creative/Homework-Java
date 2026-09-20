package task2;

import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter room length (integer): ");
        int length = scanner.nextInt();

        System.out.print("Enter room width (integer): ");
        int width = scanner.nextInt();

        System.out.print("Enter tile price per square unit (floating-point): ");
        double price = scanner.nextDouble();

        if (length <= 0 || width <= 0) {
            System.out.println("Error: Length and width must be greater than zero.");
        } else if (price < 0) {
            System.out.println("Error: Price cannot be negative.");
        } else {
       
            int area = length * width;

            // 5% extra tiles er hisab kora (Area er sathe 1.05 gun korle 5% add hoye jay)
            double totalTilesNeeded = area * 1.05;

            double totalCost = totalTilesNeeded * price;

            System.out.printf("Total amount of money required: %.2f%n", totalCost);
        }

        scanner.close();
    }
}
