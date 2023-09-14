package com.company;

public class Mustang extends Transport {
    private int year;

    public Mustang(String model, int year) {
        super(model);
        this.year = year;
    }

    public int getYear() {
        return year;
    }


    @Override
    public void print() {
super.print();
        System.out.println(" Mustang --->Info " + " год:" +getYear()+ " модель: " +getModel());
    }
}
