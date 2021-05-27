package com.company;

import java.util.ArrayList;

public class Accountant extends  BusinessEmployee{

    public ArrayList<Accountant> reports=new ArrayList<>();
    public Accountant(String name) {

        super(name);
        super.setBonusBudget(0);
    }
    private TechnicalLead teamSupported;
    public TechnicalLead getTeamSupported()
    {

        return teamSupported;

    }

    public void supportTeam(TechnicalLead lead) {
        double total = 0;
        teamSupported = lead;
        for (int i = 0; i < teamSupported.reports.size(); i++)
        {
            total += teamSupported.reports.get(i).getBaseSalary();
        }
        this.setBonusBudget(total * 10/100);
    }


    public boolean approveBonus(double bonus) {

        if (bonus > getBonusBudget() && getTeamSupported() == null) {
                return false;
            }
         else
            return true;


    }
        @Override
        public String employeeStatus(){
            return super.toString() + " " + " is supporting " + " " + getTeamSupported();
        }
    }


