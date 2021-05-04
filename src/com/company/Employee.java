package com.company;

abstract public class Employee {
    // Instance variable
    private String name;
    public double baseSalary;
    private int empID;
    public double bonus_budget;


    public int head_count = 0;
    // variable declared with reference data type
    private Employee manager;


    // Class variable, thus static keyword is used,can pile up a number of employees.
    private static int ID_count;

    public Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
        empID++;
        this.empID = ID_count;
    }
    public double getBaseSalary(){
        return baseSalary;
    }
    public String getName(){
        return name;
    }
    public int getEmpID(){
        return empID;
    }

    public Employee getManager(){
        return manager;
    }

    public boolean equals(Employee other){
        return this.getEmpID() == other.getEmpID();
    }

    public String toString(){
        return getEmpID()+ " " + getName();
    }

    abstract public String employeeStatus();

}
