package com.company;
import java.util.ArrayList;
public class TechnicalLead extends TechnicalEmployee {
    private static double headCount;
    BusinessLead businessLead;
    ArrayList<SoftwareEngineer> group;

    public TechnicalLead(String name) {
        super(name);
        super.setBaseSalary(getBaseSalary() * 1.3);
        headCount = 4;
        this.group = new ArrayList<SoftwareEngineer>();
    }

    boolean hasHeadcount() {
        if (group.size() < headCount) {
            return true;
        } else
            return false;
    }

    public boolean addReport(SoftwareEngineer e) {
        if (this.hasHeadcount()) {
            this.group.add(e);
            e.setManager(this);
            return true;
        } else
            return false;
    }

    public boolean approveCheckIn(SoftwareEngineer e) {
        if (e.getManager().equals(this) && e.getCodeAccess())
            return true;
        else
            return false;
    }

    public boolean requestBonus(Employee e, double bonus) {
        e.getManager();
        if (businessLead.approveBonus(e, bonus)) {
            return true;
        } else
            return false;
    }

    public String getTeamStatus() {
        if (group.size() == 0) {
            return super.employeeStatus() + " and no direct reports yet";
        } else {
            String teamSt = "";
            for (int i = 0; i < group.size(); i++) {
                teamSt += (" " + group.get(i).employeeStatus() + "\n");
            }
            return this.employeeStatus() + "and is managing:  \n" + teamSt;
        }

    }
}

