package L41_Sphere;

import java.text.DecimalFormat;

public class Sphere {

    DecimalFormat decimalFormat = new DecimalFormat("0.#####");

    private double radius;
    private double volume;
    private double surface;


    public Sphere(double radius){
        this.radius= radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void calculation(){
        volume = (4/3)*Math.PI*Math.pow(radius,3);
        surface = 4*Math.PI*Math.pow(radius,2);
    }

    public String toString(){
        return "Volume is : " + decimalFormat.format(volume) +
                "\nSurface is: " + decimalFormat.format(surface);
    }
}
