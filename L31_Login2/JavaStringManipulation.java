package L31_Login2;

import java.util.Random;
import java.util.Scanner;

public class JavaStringManipulation {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    private String firstName;
    private String lastName;
    private String finalName;
    private int rnd;

    public void questions() {
        System.out.println("Please enter your first and last name:");
        firstName = scanner.next();
        lastName = scanner.next();

        while (lastName.length()<5){
            System.out.println("Last name must be at least 5 characters long, please make sure your name is 5 characters long, otherwise you are fucked!!!, LOL");
            lastName = scanner.next();
        }

        rnd = random.nextInt((99-10)+1)+10;

//        finalName = firstName.substring(0,1).toLowerCase() + lastName.substring(0,5).toLowerCase() + rnd;
        finalName = firstName.substring(0,1).toLowerCase();
        finalName += lastName.substring(0,5).toLowerCase();
        finalName += rnd;

        System.out.println("Your login is:\n" + finalName);
    }


}
