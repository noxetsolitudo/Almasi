package L431_Car;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String _make;
        String _model;
        int _year;
        boolean quit = false;
        String toQuit;

        Car car = new Car("", "", 0);

        while (!quit) {

            System.out.println("Please enter the make of the car: ");
            _make = scanner.next();
            System.out.println("Please enter the model of the car: ");
            _model = scanner.next();
            System.out.println("Please enter the year of the car: ");
            _year = scanner.nextInt();

            car.setMake(_make);
            car.setModel(_model);
            car.setYear(_year);
            scanner.nextLine();

            System.out.println(car);
            System.out.println("Press 'Q' to quit or any key to continue");
            toQuit = scanner.next();

            if (toQuit.equalsIgnoreCase("Q")) {
                quit = true;
            }

        }

        scanner.close();
        car.scannerClose();
        System.out.println("Good bye!");


    }
}
