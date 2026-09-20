package task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x1 (upper-left x): ");
        int x1 = scanner.nextInt();

        System.out.print("Enter y1 (upper-left y): ");
        int y1 = scanner.nextInt();

        System.out.print("Enter x2 (lower-right x): ");
        int x2 = scanner.nextInt();

        System.out.print("Enter y2 (lower-right y): ");
        int y2 = scanner.nextInt();

        int width = Math.abs(x2 - x1);
        int height = Math.abs(y1 - y2);

        int s = width * height;
        int p = 2 * (width + height);

        System.out.println("Area (s) = " + s);
        System.out.println("Perimeter (p) = " + p);

        scanner.close();
    }
}