package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws FileNotFoundException {
        ArrayList<RentalCars> carList = new ArrayList<>();
        ArrayList<FamilyCar> familyCarList = new ArrayList<>();
        ArrayList<LuxuryCar> luxuryCarList = new ArrayList<>();
        ArrayList<SportsCar> sportsCarList = new ArrayList<>();
        ArrayList<RentalInfo> rentalList = new ArrayList<>();
        ArrayList<CompanyRental> companyRentalList = new ArrayList<>();
        ArrayList<PrivateRental> privateRentalList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Scanner readFam = new Scanner(new File("C:\\Users\\Mathi\\OneDrive\\Skrivebord\\IntelliJ\\Honolulu Car Rental\\src\\com\\company\\FamilyCars.txt"));
        Scanner readSport = new Scanner(new File("C:\\Users\\Mathi\\OneDrive\\Skrivebord\\IntelliJ\\Honolulu Car Rental\\src\\com\\company\\SportsCars.txt"));
        Scanner readLux = new Scanner(new File("C:\\Users\\Mathi\\OneDrive\\Skrivebord\\IntelliJ\\Honolulu Car Rental\\src\\com\\company\\LuxuryCars.txt"));

        SportsCar porsche = new SportsCar("Porsche", "911", "Petrol", "GW40958", "20/05-2020", 3500, true, 420);
        sportsCarList.add(porsche);
        carList.add(porsche);
        SportsCar tesla = new SportsCar("Tesla", "Roadster", "Electric", "BG20125", "01/04-2019", 6250, false, 630);
        sportsCarList.add(tesla);
        carList.add(tesla);
        SportsCar jaguar = new SportsCar("Jaguar", "F-Type", "Petrol", "OS96124", "04/02-2018", 9510, true, 587);
        sportsCarList.add(jaguar);
        carList.add(jaguar);
        SportsCar chevrolet = new SportsCar("Chevrolet", "Corvette C8", "Petrol", "AE15201", "16/03-2020", 6230, true, 600);
        sportsCarList.add(chevrolet);
        carList.add(chevrolet);
        FamilyCar nissan = new FamilyCar("Nissan", "Quest", "Petrol", "HF38663", "13/08-2017", 11000, false, true, false, 7);
        carList.add(nissan);
        familyCarList.add(nissan);
        FamilyCar ford = new FamilyCar("Ford", "S-Max", "Diesel", "CV17345", "16/11-2020", 28425, false, true, true, 7);
        carList.add(ford);
        familyCarList.add(ford);
        PrivateRental peter = new PrivateRental("Peter Svendsen", "KEAvej 15", "2200", "København", 53202890, 75308410, "pesv@yahoo.dk", 4514524, "15/04-1985");
        privateRentalList.add(peter);
        rentalList.add(peter);

        clearScreen();

        int ans1 = -1;

    while (ans1 != 0){
        System.out.println("-------------------------------------");
        System.out.println("|                                   |");
        System.out.println("|        Honolulu Car Rental        |");
        System.out.println("|                                   |");
        System.out.println("-------------------------------------\n");
        System.out.println("Main menu:\n");
        System.out.println("Press 1 to make a new car entry");
        System.out.println("Press 2 to print an overview of the rentable cars");
        System.out.println("Press 3 to make a new rental entry");
        System.out.println("Press 4 to print an overview of renters");
        System.out.println("Press 0 to quit the program\n");

        ans1 = input.nextInt();

            switch (ans1) {
                case 1:
                    clearScreen();
                    entryMenu();
                    int ans2 = input.nextInt();
                    if (ans2 == 1) {
                        clearScreen();
                        SportsCar customSportsCar = SportsCar.newSportsCarEntry(input);
                        sportsCarList.add(customSportsCar);
                        carList.add(customSportsCar);
                        saveSportsCarsToFile(sportsCarList);
                        System.out.println("\nNew entry added successfully");
                        break;
                    }

                    if (ans2 == 2) {
                        clearScreen();
                        FamilyCar customFamilyCar = FamilyCar.newFamilyCarEntry(input);
                        familyCarList.add(customFamilyCar);
                        carList.add(customFamilyCar);
                        saveFamilyCarsToFile(familyCarList);
                        System.out.println("\nNew entry added successfully");
                        break;
                    }

                    if (ans2 == 3) {
                        clearScreen();
                        LuxuryCar customLuxuryCar = LuxuryCar.newLuxuryCarEntry(input);
                        luxuryCarList.add(customLuxuryCar);
                        carList.add(customLuxuryCar);
                        saveLuxuryCarsToFile(luxuryCarList);
                        System.out.println("\nNew Entry added successfully");
                        clearScreen();
                        break;
                    } else {
                        System.out.println("Wrong input\n\n\n");
                        break;
                    }
                case 2:
                    clearScreen();
                    printMenu();
                    int ans3 = input.nextInt();
                    if (ans3 == 1) {
                        clearScreen();
                        printFullList(carList);
                        break;
                    }

                    if (ans3 == 2) {
                        clearScreen();
                        printSportsCarList(sportsCarList);
                        break;
                    }

                    if (ans3 == 3) {
                        clearScreen();
                        printFamilyCarList(familyCarList);
                        break;
                    }

                    if (ans3 == 4) {
                        clearScreen();
                        printLuxuryCarList(luxuryCarList);
                        break;
                    }

                    else{
                        System.out.println("Wrong input\n");
                    }
                case 3:
                    clearScreen();
                    entryRentalMenu();
                    int ans4 = input.nextInt();
                    if (ans4 == 1){
                        PrivateRental customRental = PrivateRental.newPrivateRentalEntry(input);
                        rentalList.add(customRental);
                        privateRentalList.add(customRental);
                        savePrivateRentalToFile(privateRentalList);
                    }

                    if (ans4 == 2){
                        //company rental
                    }
                    else{
                        System.out.println("Wrong input\n");
                    }

                case 4:
                    clearScreen();
                    printRentalMenu();
                    int ans5 = input.nextInt();
                    if (ans5 == 1){
                        System.out.println();
                    }

                    if (ans5 == 2){
                        printPrivateRentalList(privateRentalList);
                    }
                }
            }
    }

    public static void clearScreen(){
        for(int i = 1; i <= 50; i++){
            System.out.println();
        }
    }

    public static void entryMenu(){
        System.out.println("-----------------------");
        System.out.println("|                     |");
        System.out.println("|    New Car Entry    |");
        System.out.println("|                     |");
        System.out.println("-----------------------\n");
        System.out.println("Which category do you want to make a new entry in?\n");
        System.out.println("1. Sports car");
        System.out.println("2. Family car");
        System.out.println("3. Luxury car\n");
    }

    public static void printMenu(){
        System.out.println("-------------------");
        System.out.println("|                 |");
        System.out.println("|    Printmenu    |");
        System.out.println("|                 |");
        System.out.println("-------------------\n");
        System.out.println("Which category do you want to print?\n");
        System.out.println("1. All categories");
        System.out.println("2. Sports car");
        System.out.println("3. Family car");
        System.out.println("4. Luxury car\n");
    }

    public static void entryRentalMenu(){
        System.out.println("--------------------------");
        System.out.println("|                        |");
        System.out.println("|    New Rental Entry    |");
        System.out.println("|                        |");
        System.out.println("--------------------------\n");
        System.out.println("What kind of entry do you want to make?\n");
        System.out.println("1. Private rental entry");
        System.out.println("2. Company rental entry");
    }

    public static void printRentalMenu(){
        System.out.println("-------------------");
        System.out.println("|                 |");
        System.out.println("|    Printmenu    |");
        System.out.println("|                 |");
        System.out.println("-------------------\n");
        System.out.println("Which category do you want to print?\n");
        System.out.println("1. All categories");
        System.out.println("2. Private rentals");
        System.out.println("3. Company rentals\n");
    }

    public static void printFullList(ArrayList<RentalCars> list){
        System.out.println("\n------------------------------------\n");
        for (RentalCars rentalCars : list) {
            System.out.println(rentalCars + "\n\n------------------------------------\n");
        }
    }

    public static void printSportsCarList(ArrayList<SportsCar> list){
        System.out.println("\n------------------------------------\n");
        for (SportsCar sportsCars : list) {
            System.out.println(sportsCars + "\n\n------------------------------------\n");
        }
    }

    public static void printFamilyCarList(ArrayList<FamilyCar> list){
        System.out.println("\n------------------------------------\n");
        for (FamilyCar familyCars : list) {
            System.out.println(familyCars + "\n\n------------------------------------\n");
        }
    }

    public static void printLuxuryCarList(ArrayList<LuxuryCar> list){
        System.out.println("\n------------------------------------\n");
        for (LuxuryCar luxuryCars : list) {
            System.out.println(luxuryCars + "\n\n------------------------------------\n");
        }
    }

    public static void printPrivateRentalList(ArrayList<PrivateRental> list){
        System.out.println("\n------------------------------------\n");
        for (PrivateRental privateRental : list) {
            System.out.println(privateRental + "\n\n------------------------------------\n");
        }
    }

    public static void saveFamilyCarsToFile(ArrayList<FamilyCar> familyCarList)throws FileNotFoundException{
        PrintStream write = new PrintStream("C:\\Users\\Mathi\\OneDrive\\Skrivebord\\IntelliJ\\Honolulu Car Rental\\src\\com\\company\\FamilyCars.txt");
        for (FamilyCar familyCar: familyCarList){
            write.println(familyCar + "\n");
        }
    }

    public static void saveSportsCarsToFile(ArrayList<SportsCar> sportsCarList)throws FileNotFoundException{
        PrintStream write = new PrintStream("C:\\Users\\Mathi\\OneDrive\\Skrivebord\\IntelliJ\\Honolulu Car Rental\\src\\com\\company\\SportsCars.txt");
        for (SportsCar sportsCar: sportsCarList){
            write.println(sportsCar + "\n");
        }
    }

    public static void saveLuxuryCarsToFile(ArrayList<LuxuryCar> luxuryCarList)throws FileNotFoundException{
        PrintStream write = new PrintStream("C:\\Users\\Mathi\\OneDrive\\Skrivebord\\IntelliJ\\Honolulu Car Rental\\src\\com\\company\\LuxuryCars.txt");
        for (LuxuryCar luxuryCar: luxuryCarList){
            write.println(luxuryCar + "\n");
        }
    }

    public static void savePrivateRentalToFile(ArrayList<PrivateRental> privateRentalList)throws FileNotFoundException{
        PrintStream write = new PrintStream("C:\\Users\\Mathi\\OneDrive\\Skrivebord\\IntelliJ\\Honolulu Car Rental\\src\\com\\company\\PrivateRentals.txt");
        for (PrivateRental privateRental: privateRentalList){
            write.println(privateRental + "\n");
        }
    }

    public static void appendFamilyCars(FamilyCar custom)throws FileNotFoundException{
        try{
            FileWriter appendNE = new FileWriter("C:\\Users\\Mathi\\OneDrive\\Skrivebord\\IntelliJ\\Honolulu Car Rental\\src\\com\\company\\FamilyCars.txt", true);
            BufferedWriter out = new BufferedWriter(appendNE);

            String brand = custom.brand;
            String model = custom.model;
            String fuelType = custom.fuelType;
            String regNum = custom.regNum;
            String regDate = custom.regDate;
            int odometer = custom.odometer;
            boolean manualGear = custom.manualGear;
            boolean airCondition = custom.airCondition;
            boolean cruiseControl = custom.cruiseControl;
            int seats = custom.seats;

            out.write("Brand: " + brand + "\nModel" + model + "\nFuel type: " + fuelType + "\nKilometers driven: " + odometer + "\nManual gear: " + manualGear + "\nAircondition: " + airCondition + "\nCruise control: " + cruiseControl + "\nSeats: " + seats);
            out.close();

        }catch (Exception er){
            System.err.println("Error while printing" + er.getMessage());
        }
    }

    public static void appendSportsCars(SportsCar custom)throws FileNotFoundException{
        try{
            FileWriter appendNE = new FileWriter("C:\\Users\\Mathi\\OneDrive\\Skrivebord\\IntelliJ\\Honolulu Car Rental\\src\\com\\company\\SportsCars.txt", true);
            BufferedWriter out = new BufferedWriter(appendNE);

            String brand = custom.brand;
            String model = custom.model;
            String fuelType = custom.fuelType;
            String regNum = custom.regNum;
            String regDate = custom.regDate;
            int odometer = custom.odometer;
            boolean manualGear = custom.manualGear;
            int horsePower = custom.horsePower;

            out.write("Brand: " + brand+ "\nModel: " + model + "\nFuel type: " + fuelType + "\nRegistration number: " + regNum + "\nRegistration date: " + regDate + "\nKilometers driven: " + odometer + "\nManual gear: " +manualGear + "\nHorsepower: " + horsePower + "\n\n");
            out.close();

        }catch (Exception er){
            System.err.println("Error while printing" + er.getMessage());
        }
    }
}
