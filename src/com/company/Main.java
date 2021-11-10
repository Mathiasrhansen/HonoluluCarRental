package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<RentalCars> carList = new ArrayList<>();

        SportsCar porsche = new SportsCar("Porsche", "911", "Petrol", "GW40958", "20/05-2020", 3500, true, 420);
        carList.add(porsche);
        FamilyCar nissan = new FamilyCar("Nissan", "Quest", "Petrol", "HF38663", "13/08-2017", 11000, false, true, false, 7);
        carList.add(nissan);

        for (int i = 0; i < carList.size(); i++){
            System.out.println(carList.get(i) + "\n\n******************\n");
        }
    }
}
