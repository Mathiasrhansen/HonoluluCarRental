package com.company;

public class FamilyCar extends RentalCars{
    boolean manualGear;
    boolean airCondition;
    boolean cruiseControl;
    int seats;

    public FamilyCar(String b, String m, String fuel, String r, String rd, int o, boolean mGear, boolean air, boolean cc, int s){
        super(b, m, fuel, r ,rd, o);
        manualGear = mGear;
        airCondition = air;
        cruiseControl = cc;
        seats = s;
    }

    @Override
    public String toString() {
        return ("Brand: " + brand + "\nModel: " + model + "\nFuel type: " + fuelType + "\nRegistration number: " + regNum
                + "\nRegistration date: " + regDate + "\nKilometers driven: " + odometer + "\nManual gear: " + manualGear
                + "\nAir condition: " + airCondition + "\nCruise control: " + cruiseControl + "\nSeats: " + seats);
    }
}
