package com.company;

public class Mercedes extends Transport {
    private double volume ;

    public Mercedes(String model, double volume) {
        super(model);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public void print() {
super.print();
        System.out.println( "Mercedes ---> Info:" + " объем:"+getVolume()+" модель:"+getModel());
    }
}
