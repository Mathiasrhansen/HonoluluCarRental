package com.company;

public class RentalCars {
    String brand;
    String model;
    String fuelType;
    String regNum;
    String regDate;
    int odometer;

    public  RentalCars(){
    }

    public RentalCars (String b, String m, String fuel, String r, String rd, int o){
        brand = b;
        model = m;
        fuelType = fuel;
        regNum = r;
        regDate = rd;
        odometer = o;
    }

    public String toString(){
        return ("Brand: " + brand + "\nModel: " + model + "\nFuel type: " + fuelType + "\nRegistration number: " + regNum
                + "\nRegistration date: " + regDate + "Kilometers driven: " + odometer);
    }
}
