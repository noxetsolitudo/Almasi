package L31_Login;

import java.util.Random;
import java.util.Scanner;

public class JavaStringManipulation {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    String firstName;
    String lastName;
    String finalName;
    int rnd;

    public void QA() {
        System.out.println("Please enter first name:");
        firstName = scanner.next();

        System.out.println("Please enter last name:");
        lastName = scanner.next();

        while (lastName.length() < 5) {
            System.out.println("The last name must be at leat 5 chracters long, please enter once more");
            lastName = scanner.next();
        }

        scanner.close();


        finalName = firstName.substring(0, 1);
        finalName += lastName.substring(0, 5);
        finalName += random.nextInt((99 - 10) + 1) + 10;

        System.out.println(finalName);
    }
}
