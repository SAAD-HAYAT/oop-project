package com.company;
import java.util.ArrayList;
public class TechnicalLead extends TechnicalEmployee{
    private  static double headCount;
    ArrayList<SoftwareEngineer> group = new ArrayList<SoftwareEngineer>();
    public TechnicalLead(String name){
        super(name);
        super.setBaseSalary(getBaseSalary()*1.3);
        headCount=4;
    }
    boolean hasHeadcount(){
        if(group.size()<headCount) {
            return true;
        }
        else
            return false;
    }
    public  boolean addReport(SoftwareEngineer e){
        if(this.hasHeadcount()) {
            this.group.add(e);
            return true;
        }
        else
            return false;
    }
    public boolean approveCheckIn(SoftwareEngineer e) {
        if (this.addReport(e) && e.getCodeAccess())
            return true;
        else
        return false;
    }
//    public boolean requestBonus(Employee e, double bonus){
//
//    }
//    public String getTeamStatus(){
//
//    }

}
