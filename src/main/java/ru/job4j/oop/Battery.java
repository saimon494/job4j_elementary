package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        another.load += this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery battery = new Battery(40);
        Battery battery1 = new Battery(15);
        battery.exchange(battery1);
        System.out.println(battery.load);
        System.out.println(battery1.load);
    }
}
