package L43_Car;

import java.util.Scanner;

public class CarTest {

    public static void main(String[] args) {

        String _model = "";
        String _make = "";
        int _year = 0;
        int _numberOfCars = 0;

        Scanner scanner = new Scanner(System.in);

        Car car = new Car(_model, _make, _year);


        System.out.println("Please insert the model of the car: ");
        _model = scanner.next();
        System.out.println("Please insert the make of the car: ");
        _make = scanner.next();
        System.out.println("Please insert the year of the car: ");
        _year = scanner.nextInt();
        while (_year < 2000) {
            System.out.println("The date of the car is too low, please insert again or go back to veteran section.");
            _year = scanner.nextInt();
        }
        System.out.println("Please insert the number of cars wanted to be produced: ");
        _numberOfCars = scanner.nextInt();
        while (_numberOfCars <= 0) {
            System.out.println("Please enter non negative number of required cars.");
            _numberOfCars = scanner.nextInt();
        }


        scanner.close();


        car.factory();
//        System.out.println(car);


    }
}
