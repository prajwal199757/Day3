package com.training.org;

public class XYZBank {
    private String bankName;
    private String bankAddress;
    private int noOfEmployees;

    public XYZBank(String bankName, String bankAddress, int noofEmployees) {
        this.bankName = bankName;
        this.bankAddress = bankAddress;
        this.noOfEmployees = noofEmployees;
    }
    public  XYZBank() {
    }

    public String toString(){
        return "Bank Details are "+bankName+" Address "+bankAddress+" NoOfEmployees"+noOfEmployees;
    }
}
