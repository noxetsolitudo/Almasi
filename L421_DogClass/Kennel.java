package L421_DogClass;

import java.util.Scanner;

public class Kennel {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name_;
        int age_;

        System.out.println("Please enter the name of your dog:");
        name_=scanner.next();
        System.out.println("Please enter the age of your dog:");
        age_=scanner.nextInt();

        Dog dog = new Dog(name_,age_);
        System.out.println(dog);
    }
}
