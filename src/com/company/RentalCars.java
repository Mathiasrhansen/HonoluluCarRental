package com.company;

public class RentalCars {
    String brand;
    String model;
    String fuelType;
    int regNum;
    String regDate;
    int odometer;

    public  RentalCars(){
    }
    public RentalCars (String b, String m, String fuel, int r, String rd, int o){
        brand = b;
        model = m;
        fuelType = fuel;
        regNum = r;
        regDate = rd;
        odometer = o;
    }
}
