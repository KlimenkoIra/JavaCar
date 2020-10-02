package com.example.car;

public class FactoryCarArray {
    public static CarArray createCarArray(int n){
        CarArray array = new CarArray(n);

        for(int i = 0; i < n; i++)
        {
            array.setElement(i, new Car());
        }

        return array;
    }
}
