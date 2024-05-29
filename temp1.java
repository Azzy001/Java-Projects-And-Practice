import java.util.ArrayList;
import java.util.List;

public class CarsOne {
    // attributes or private variables of our class
    private String make = "";
    private String model = "";
    private String bodyType = "";
    private String colour = "";
    private String transmission = "";
    private String fuelType = "";
    private int age = 0;
    private int milage = 0;
    private int doors = 0;
    private int cost = 0;

    
    public CarsOne(String make, String model, String bodyType, String colour, String transmission, String fuelType,  int age, int milage, int doors,  int cost){
        // class constructor
        this.make = make;
        this.model = model;
        this.bodyType = bodyType;
        this.colour = colour;
        this.transmission = transmission;
        this.fuelType = fuelType;
        this.age = age;
        this.milage = milage;
        this.doors = doors;
        this.cost = cost;
    }

    // getters
    public String getMake(){
        return this.make;
    }
    public String getModel(){
        return this.model;
    }
    public String getBodyType(){
        return this.bodyType;
    }
    public String getColour(){
        return this.colour;
    }
    public String getTransmission(){
        return this.transmission;
    }
    public String getFuelType(){
        return this.fuelType;
    }
    public int getAge(){
        return this.age;
    }
    public int getMilage(){
        return this.milage;
    }
    public int getDoors(){
        return this.doors;
    }
    public int getCost(){
        return this.cost;
    }

    // setters
    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setBodyType(String bodyType){
        this.bodyType = bodyType;
    }
    public void setColour(String colour){
        this.colour = colour;
    }
    public void setTransmission(String transmission){
        this.transmission = transmission;
    }
    public void setFuelType(String fuelType){
        this.fuelType = fuelType;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setMilage(int milage){
        this.milage = milage;
    }
    public void setDoors(int doors){
        this.doors = doors;
    }
    public void setCost(int cost){
        this.cost = cost;
    }

    public void describeCar(){
        System.out.println("Make: "+ this.make + "\n" +
        "Model: " + this.model + "\n" +
        "Body type: " + this. bodyType + "\n" +
        "Colour: " + this.colour + "\n" +
        "Transmission: " + this.transmission + "\n" +
        "Fuel type: " + this.fuelType + "\n" +
        "Age: " + this.age + "\n" +
        "Milage: " + this.milage + "\n" +
        "Doors: " + this.doors + "\n" +
        "Cost: " + this.cost);
    }
// end of code
}

--------------------------------------------------------

public class CarsObjOne {
    public static void main(String[] args){
        CarsOne car1 = new CarsOne("", "", "", "", "", "", 0, 0, 0, 0);
        System.out.println("");
        car1.describeCar();
        System.out.println("\n----- Cars Dealership --------------->\n");
        car1.setMake("BMW");
        car1.setModel("8 Series");
        car1.setBodyType("Saloon");
        car1.setColour("Baby blue");
        car1.setTransmission("Automatic");
        car1.setFuelType("Petrol");
        car1.setAge(2024);
        car1.setMilage(204);
        car1.setDoors(5);
        car1.setCost(65_000);
        car1.describeCar();
        System.out.println("\n------------------------------------->\n");
    }
}

--------------------------------------------------------

import java.util.ArrayList;

public static void main(String[] args) { // enhanced for loop
  CarsOne car_one = new CarsOne("BMW", "3 Series", "Saloon", "Baby blue", "Automatic", "Petrol", 2022, 10_000, 5, 35_000);
  
  ArrayList<CarsOne> cars = new ArrayList<CarsOne>();
  cars.add(car_one);

  for (CarsOne c : cars) {
    c.describeCar();
  }
}

  
