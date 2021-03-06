package L41_Sphere;

import java.util.Scanner;

public class MultySphere {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double r = 0;

        System.out.println("Please enter the radius: ");
        r = scanner.nextDouble();

        while(r <0){
            System.out.println("Please enter a positive number.");
            r = scanner.nextDouble();
        }

        scanner.close();

        Sphere sphere = new Sphere(r);
        sphere.calculation();
        System.out.println(sphere);




    }
}
