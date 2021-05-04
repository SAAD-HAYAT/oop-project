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

//    public boolean checkInCode(){
//        if
//    }

}
