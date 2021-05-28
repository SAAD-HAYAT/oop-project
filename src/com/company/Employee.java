package com.company;
public abstract class Employee {
    private static int id=0;
   private String name;
   private double baseSalary;
   private int EmployeeID;
   private  double bonus;

   public Employee(String name, double baseSalary){
       id++;
       this.setEmployeeID(id);
       this.setName(name);
       this.setBaseSalary(baseSalary);
   }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int employeeID) {
        EmployeeID = employeeID;
    }
    private Employee manager;

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public boolean equals(Employee other){
        return this.getEmployeeID() == other.EmployeeID;
    }
    public String toString(){
        return this.getEmployeeID()+ " " + this.getName();
    }
    public abstract String employeeStatus();
}
