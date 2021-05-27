package com.company;

public class SoftwareEngineer extends TechnicalEmployee{
    private boolean codeAccess;
    SoftwareEngineer e;
    public SoftwareEngineer(String name){
        super(name);
        this.setCodeAccess(true);
        this.e=e;
        super.Checkins();
    }

    public boolean getCodeAccess() {
        return codeAccess;
    }

    public void setCodeAccess(boolean codeAccess) {
        this.codeAccess = codeAccess;
    }
    public int getSuccessfulCheckIns(){
        return super.checkins;
    }

    public boolean checkInCode(){
        TechnicalLead manager=(TechnicalLead) this.getManager();
        if (manager.approveCheckIn(e)){
            this.Checkins();
            return true;
        }
        else
        {this.setCodeAccess(false);
        return false;
        }
    }
    @Override
    public String employeeStatus(){
        return super.toString()+"has" +this.checkins+ "successful check ins ,is supporting " + super.getName();
    }
}
