package com.company;

public class SoftwareEngineer extends TechnicalEmployee{
    private boolean codeAccess;
    public SoftwareEngineer(String name){
        super(name);
        this.setCodeAccess(true);
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

    public boolean checkInCode(TechnicalLead t,SoftwareEngineer e){
        if (t.approveCheckIn(e)){
            this.getSuccessfulCheckIns();
            return true;
        }
        else
        return false;
    }
    @Override
    public String employeeStatus(){
        return super.toString()+"has" +this.checkins+ "successful check ins ,is supporting " + super.getName();
    }
}
