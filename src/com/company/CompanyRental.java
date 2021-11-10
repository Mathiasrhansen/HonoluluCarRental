package com.company;

public class CompanyRental extends RentalInfo{
    String companyName;
    String companyAddress;
    int companyPhoneNum;
    int companyRegNum;

    public CompanyRental(String n, String a, String post, String c, int mp, int p, String e, String cm, String ca, int cpn, int crn){
        super(n, a, post, c, mp, p , e);
        companyName = cm;
        companyAddress = ca;
        companyPhoneNum = cpn;
        companyRegNum = crn;
    }
}
