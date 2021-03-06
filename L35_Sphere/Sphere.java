package L35_Sphere;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Sphere {

    Scanner scanner = new Scanner(System.in);
    DecimalFormat decFor = new DecimalFormat("0.###");

    private double radius;
    private double volume;
    private double surface;

//    public Sphere(double radius) {
//        this.radius = radius;
//    }

    public void all(){
        System.out.println("Please enter the radius f the sphere: ");

        radius = scanner.nextDouble();

        while (radius <=0){
            System.out.println("Please enter non negative value.");
            radius = scanner.nextDouble();
            scanner.close();
        }

        volume = (4/3)*Math.PI*Math.pow(radius,3);
        surface = 4*Math.PI*Math.pow(radius,3);
        System.out.println("The volume of the sphere is: " + decFor.format(volume) + "\n"
         + "The surface of the sphere is: " + decFor.format(surface));
    }


}
