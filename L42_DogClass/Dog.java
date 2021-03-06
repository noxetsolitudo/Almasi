package L42_DogClass;

public class Dog {

    private String name = new String();
    private int age;
    private int dogsYears;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int dogsYears() {
        dogsYears = age * 7;
        return dogsYears;
    }

    public String toString(){
        return "Dog " + getName() + " is " + dogsYears() + " human years old.";
    }


}
