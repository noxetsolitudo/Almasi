package L43_Car;

public class Car {
    private String model;
    private String make;
    private int year;
    private int VIN = 0;
    private int numberOfCars = 5;

    public Car(){

    }

    public Car(String model, String make, int year) {
        this.model = model;
        this.make = make;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumberOfCars() {
        return numberOfCars;
    }

    public void setNumberOfCars(int numberOfCars) {
        this.numberOfCars = numberOfCars;
    }

    public void factory(){
        for (int i = 1; i <= getNumberOfCars(); i++) {
            VIN++;
            System.out.println( "Model: " + getModel() + "\nMake: " + getMake() + "\nYear: " + getYear() + "\nVIN: " + VIN);
        }
    }

//    public int asignVIN(){
//        return VIN++;
//    }

//    public String toString(){
//        return "Model: " + model + "\nMake: " + make + "\nYear: " + year + "\nVIN: " + VIN;
//    }

}
