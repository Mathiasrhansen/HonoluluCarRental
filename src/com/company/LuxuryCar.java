package com.company;

public class LuxuryCar extends RentalCars{
    int ccm;
    boolean automaticGear;
    boolean airCondition;
    boolean cruiseControl;
    boolean leatherSeats;

    public LuxuryCar(String b, String m, String fuel, int r, String rd, int o, int c, boolean aGear, boolean air, boolean cc, boolean l){
        super(b, m, fuel, r, rd, o);
        ccm = c;
        automaticGear = aGear;
        airCondition = air;
        cruiseControl = cc;
        leatherSeats = l;
    }

    @Override
    public String toString(){
        return ("Brand: " + brand + "\nModel: " + model + "\nFueltype: " + fuelType + "\nRegistration number: " + regNum
                + "\nRegistration date: " + regDate + "Kilometers driven: " + odometer + "\nCCM: " + ccm
                + "\nAutomatic gear: " + automaticGear + "\nAircondition: " + airCondition + "\nCruise control: "
                + cruiseControl + "\nLeather seats: " + leatherSeats);
    }
}
