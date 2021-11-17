package com.company;

import java.util.Scanner;

public class LuxuryCar extends RentalCars{
    int ccm;
    boolean automaticGear;
    boolean airCondition;
    boolean cruiseControl;
    boolean leatherSeats;

    public LuxuryCar(String b, String m, String fuel, String r, String rd, int o, int c, boolean aGear, boolean air, boolean cc, boolean l){
        super(b, m, fuel, r, rd, o);
        ccm = c;
        automaticGear = aGear;
        airCondition = air;
        cruiseControl = cc;
        leatherSeats = l;
    }

    @Override
    public String toString(){
        return ("Brand: " + brand + "\nModel: " + model + "\nFuel type: " + fuelType + "\nRegistration number: " + regNum
                + "\nRegistration date: " + regDate + "Kilometers driven: " + odometer + "\nCCM: " + ccm
                + "\nAutomatic gear: " + automaticGear + "\nAircondition: " + airCondition + "\nCruise control: "
                + cruiseControl + "\nLeather seats: " + leatherSeats);
    }

    public static LuxuryCar newLuxuryCarEntry(Scanner input){
        System.out.println("What brand is the car?");
        String brand = input.next();
        System.out.println("What model is the car?");
        String model = input.next();
        System.out.println("Is it diesel or petrol?");
        String fuelType = input.next();
        System.out.println("What is the registration-number?");
        String regNum = input.next();
        System.out.println("What date what it registered? (DD/MM-YYYY)");
        String regDate = input.next();
        System.out.println("How many miles has it driven?");
        int odometer = input.nextInt();
        System.out.println("How many cubic centimeters is the engine?");
        int ccm = input.nextInt();
        boolean aGear = true;
        boolean airCondition = true;
        boolean cruiseControl = true;
        boolean leatherSeats = true;

        return new LuxuryCar(brand, model, fuelType, regNum, regDate, odometer, ccm, true, true, true, true);
    }
}
