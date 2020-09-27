package com.jrp.projectmanagement.pma.springExample;

public class Car {

    Doors d;
    Engine e;
    Tires t;

    public Car(Doors d, Engine e, Tires t) {
        this.d = d;
        this.e = e;
        this.t = t;
    }
    public void printDetails() {
        System.out.println(this.e + " " + this.d);
    }
}
