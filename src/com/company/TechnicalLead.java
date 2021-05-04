package com.company;
import java.util.ArrayList;
public class TechnicalLead extends TechnicalEmployee{
    private double baseSalary;
    private int headCount;
    public TechnicalLead(String name){
        super(name);
        baseSalary=getBaseSalary()*1.3;
        setHeadCount(4);
    }

    public int getHeadCount() {
        return headCount;
    }

    public void setHeadCount(int headCount) {
        this.headCount = headCount;
    }
//    public boolean hasHeadCount(){
//
//    }
}
