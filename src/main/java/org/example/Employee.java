package org.example;

public class Employee {

    // instance variable
  private  int salary;
  private Laptop lap;
  private Salary sal;
  private Mobile mob;


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

    public Salary getSal() {
        return sal;
    }

    public void setSal(Salary sal) {
        this.sal = sal;
    }

    //Normal Method
    public void giventask(){

        System.out.println("Completed the Given Task");
        lap.compile();

    }

    public void salarybankaccount(){
        System.out.println("Created in SBI");
        sal.bankaccount();
    }

    public void currentaccount(){
        System.out.println("created in IDBI");
        sal.newaccount();
    }

    public void electronic(){
        mob.Vivo();
    }


}
