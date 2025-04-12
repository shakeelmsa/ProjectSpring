package org.example;

public class Employee {

    // instance variable
  private  int salary;
  private Laptop lap;


    // Constructor
    public Employee(){

        System.out.println("Object Created for Employee Class");
    }

     // Getter and Setter for Lap variable
    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        System.out.println("Set Method Laptop Called");
        this.lap = lap;
    }



    //Normal Method
    public void giventask(){

        System.out.println("Completed the Given Task");
        lap.compile();
    }
}
