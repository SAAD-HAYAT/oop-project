package com.company;

import java.util.ArrayList;

public class BusinessLead {

//    public ArrayList<Accountant> reports=new ArrayList<>();
    private int headCount;

    public BusinessLead(String name)
    {
        super(name);
        super.setBaseSalary(getBaseSalary()*2.0);
        headCount = 10;
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
            bonusBudget += e.getBaseSalary() * 1.1;
            return true;
        }
        return false;
    }

    public boolean requestBonus(Employee e,double bonus)
    {

        if (bonus < bonusBudget) {
            (e).bonus += bonus;
            bonusBudget -= bonus;
            return true;
        }
        else
        {
            return false;
        }

        public boolean approveBonus(Employee e, double bonus)
        {

            for (int i = 0; i < reports.size(); i++) {
                if (reports.get(i).equals(e.getManager()) && reports.get(i).approveBonus(bonus))
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }


        }

    }







}

