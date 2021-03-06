package L34_DistanceBetweenPoints;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Run {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("" + "0.#####");

        double x1, x2, y1, y2, distance;


        System.out.println("Enter X and Y of a first point:");
        x1= scanner.nextDouble();
        y1=scanner.nextDouble();

        System.out.println("Enter X and Y of a second point:");
        x2= scanner.nextDouble();
        y2=scanner.nextDouble();

        distance = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("The distance between point X and Y is: " + dec.format(distance));
    }
}
