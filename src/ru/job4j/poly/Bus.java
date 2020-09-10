package ru.job4j.poly;

public class Bus implements Transport {

    private float price;

    @Override
    public void drive() {
        System.out.println("Bus drive");
    }

    @Override
    public void passengers(int passengers) {
        System.out.println(passengers + " are in bus");
    }

    @Override
    public float refuel(int fuel) {
        return price;
    }
}
