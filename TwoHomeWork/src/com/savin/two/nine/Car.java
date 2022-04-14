package com.savin.two.nine;

public class Car {
    private double gas = 0;
    private double gasEffective;
    private double location;

    public Car(double gasEffective){
        this.gasEffective = gasEffective;
    }

    public double getGas(){
        return gas;
    }

    public double getLocation(){
        return location;
    }

    public void move(double miles){
        location += miles;
        gas -= miles / gasEffective;
    }

    public void addGas(double gas){
        this.gas += gas;
    }


}
