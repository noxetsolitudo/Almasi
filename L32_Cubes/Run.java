package L32_Cubes;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double total;


        System.out.println("Please enter the side of the first cube:");
        a = scanner.nextDouble();

        while( a <= 0){
            System.out.println("The number must be positive and bigger than 0, please enter again.");
            a = scanner.nextDouble();
        }

        System.out.println("Please enter the side of the second cube:");
        b = scanner.nextDouble();

        while( b <= 0){
            System.out.println("The number must be positive and bigger than 0, please enter again.");
            b = scanner.nextDouble();
        }

        scanner.close();

        total = Math.pow(a,3) + Math.pow(b,3);

        System.out.println("The total of two cubes is: " + total);
    }
}
