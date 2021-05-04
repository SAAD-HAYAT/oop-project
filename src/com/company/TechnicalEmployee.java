package com.company;

public class TechnicalEmployee extends Employee {
    public int checkins;
    public TechnicalEmployee(String name){
        super(name,75000);
        this.checkins=0;
    }
    @Override
    public String employeeStatus(){
        return super.toString()+"has" +this.checkins+ "successful check ins";
    }
    public void Checkins(){
        this.checkins++;
    }
}
