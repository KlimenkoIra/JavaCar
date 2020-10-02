package com.example.car;

import java.util.Date;

public class Search {
    private Date date = new Date();

    public static void searchCarForModel(Car[] cars, String model) {
        for(Car car : cars){
            if(car.getModel().equals(model)){
                System.out.println(car);
            }
        }
    }



    public static void searchCarForModelWithExecution(Car[] cars, String model, int years) {
        for(Car car : cars){
            if(car.getModel().equals(model) && (2020 - car.getYear()) > years){
                System.out.println(car);
            }
        }
    }

    public static void searchCarForYearAndCost(Car[] cars, int year, int price) {
        for(Car car : cars){
            if((car.getYear() == year) && (car.getPrice() > price)){
                System.out.println(car);
            }
        }
    }
}
