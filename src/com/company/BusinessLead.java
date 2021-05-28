package com.company;

import java.util.ArrayList;

public class BusinessLead extends BusinessEmployee{

    public ArrayList<Accountant> reports;
    private int headCount;


    public BusinessLead(String name)
    {
        super(name);
        super.setBaseSalary(getBaseSalary()*2.0);
        headCount = 10;
        this.reports=new ArrayList<Accountant>();
    }

    public boolean hasHeadCount()
    {
        if(reports.size() < headCount)
            return true;
        else
            return false;
    }

    public boolean addReport(Accountant e, TechnicalLead supportTeam)
    {
        if (hasHeadCount())
        {
            reports.add(e);
            setBonusBudget(getBonusBudget()+(e.getBaseSalary()*1.1));
            //bonusBudget += e.getBaseSalary() * 1.1;
            return true;
        }
        return false;
    }

    public boolean requestBonus(Employee e,double bonus) {

        if (bonus < getBonusBudget()) {
            e.setBonus(getBonus()+bonus);
            setBonusBudget(getBonusBudget() - bonus);
            return true;
        } else {
            return false;
        }
    }
    public boolean approveBonus(Employee e, double bonus)
    {
        for (int i = 0; i < reports.size(); i++) {
            if (reports.get(i).equals(e.getManager()) && reports.get(i).approveBonus(bonus)) {
                return true;
            }
        }
                return false;
            }
    public String getTeamStatus() {
        if (reports.size() == 0) {
            return super.employeeStatus() + " and no direct reports yet";
        } else {
            String teamSt = "";
            for (int i = 0; i < reports.size(); i++) {
                teamSt += (" " + reports.get(i).employeeStatus() + "\n");
            }
            return this.employeeStatus() + "and is managing:  \n" + teamSt;
        }

    }
    }




