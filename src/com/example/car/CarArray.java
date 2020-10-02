package com.example.car;

public class CarArray {
    private Car[] arr;
    private int n;

    public CarArray(int n){
        if(n < 0 ) throw new IllegalArgumentException("the dimension of the array must be positive");
        this.n = n;
        arr = new Car[n];
    }

    public int getN(){
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Car getElement(int i){
        if( (i < 0 || i > this.n) ) throw new IllegalArgumentException("incorrect reference to the array element");
        return arr[i];
    }

    public void setElement(int i, Car car){
        if( (i < 0 || i > this.n) ) throw new IllegalArgumentException("incorrect reference to the array element");
        arr[i] = car;
    }

    public Car[] getArr() {
        return arr;
    }

    @Override
    public String toString(){
        String fullStr = "";
        for(int i = 0; i < n; i++){
            fullStr += arr[i];
            fullStr += "\n";
        }

        return fullStr;
    }
}
