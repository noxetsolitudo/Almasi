package L42_DogClass;

import java.util.Scanner;

public class Kenell {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String dogsName;
        int dogsAge;

        System.out.println("Please enter the name and age of the dog");
        dogsName = scanner.next();
        dogsAge = scanner.nextInt();

        scanner.close();

        Dog dog = new Dog(dogsName,dogsAge);
        Dog dog2=new Dog("Tomas",11);
        Dog dog3 = new Dog("Marfa",1);

        dog.dogsYears();
        dog2.dogsYears();
        dog3.dogsYears();

        System.out.println(dog);
        System.out.println(dog2);
        System.out.println(dog3);


    }
}
