package L421_DogClass;

import java.util.Scanner;

public class Dog {

    Scanner scanner = new Scanner(System.in);

    private String name;
    private int age;
    private int humanYearsAge;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        while (age < 0) {
            System.out.println("Please enter the correct number of years.");
            age = scanner.nextInt();
        }
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int ageCalculation() {
        return humanYearsAge = getAge() * 7;
    }


    public String toString() {
        return "The name of the dog is " + getName() + " and his age in human years is " + ageCalculation();
    }

}
