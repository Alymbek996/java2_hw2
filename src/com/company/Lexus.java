package com.company;

public class Lexus extends Transport  {
    private String color;
    private  int numberAuto;

    public Lexus(String model, String color, int numberAuto) {
        super(model);
        this.color = color;
        this.numberAuto = numberAuto;
    }

    public String getColor() {
        return color;
    }

    public int getNumberAuto() {
        return numberAuto;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Lexus--->Info:"+" номер автомобиля:"+getNumberAuto()+" цвет автомобиля:"
                +getColor()+" модель: "+getModel());

    }
}
