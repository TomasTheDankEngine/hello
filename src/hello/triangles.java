package hello;

import java.util.Scanner;

public class triangles {

    public static double areaSides(double aa, double bb, double cc) {
        double s = (aa + bb + cc) / 2;
        double areaS = Math.sqrt(s * (s - aa) * (s - bb) * (s - cc));
        return areaS;
    }

    public static double areaCoords(double[][] m) {
        double ab = Math.sqrt((Math.pow((m[1][0] - m[0][0]), 2)) + (Math.pow((m[1][1] - m[0][1]), 2)));
        double ac = Math.sqrt((Math.pow((m[2][0] - m[0][0]), 2)) + (Math.pow((m[2][1] - m[0][1]), 2)));
        double bc = Math.sqrt((Math.pow((m[2][0] - m[1][0]), 2)) + (Math.pow((m[2][1] - m[1][1]), 2)));
        if (ab >= ac + bc | ac >= ab + bc | bc >= ab + ac) {
            System.out.println("Please enter valid coordinates for valid triangle sides.");
            return 0;
        } else {
            double areaC = areaSides(ab, ac, bc);
            return areaC;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char check;
        do {
            System.out.print("To calculate triangle area using sides, enter 0. To calculate using coordinates, enter 1: ");
            int which = sc.nextInt();
            if (which == 0) {
                System.out.println("Enter first side of triangle: ");
                double a = sc.nextDouble();
                sc.nextLine();
                System.out.println("Enter second side of triangle: ");
                double b = sc.nextDouble();
                sc.nextLine();
                System.out.println("Enter third side of triangle: ");
                double c = sc.nextDouble();
                sc.nextLine();
                if (a >= b + c | b >= a + c | c >= a + b) {
                    System.out.println("Please enter valid triangle sides.");
                } else {
                    System.out.println("Area is: " + areaSides(a, b, c));
                }
            } else if (which == 1) {
                double[][] coords = new double[3][2];
                for (int row = 0; row < coords.length; row++) {
                    for (int col = 0; col < coords[row].length; col++) {
                        if (col == 0) {
                            System.out.println("Enter x" + (row + 1) + " coordinate: ");
                            coords[row][col] = sc.nextDouble();
                        }
                        if (col == 1) {
                            System.out.println("Enter y" + (row + 1) + " coordinate: ");
                            coords[row][col] = sc.nextDouble();
                        }
                    }
                }
                System.out.println("Area is: " + areaCoords(coords));
            }
            System.out.println("Calculate again (y)?");
            check = sc.next().charAt(0);
        } while (check == 'y');
    }
}