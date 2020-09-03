package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(100);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("100 rubles are " + dollar + " dollar.");
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        in = 100;
        expected = 1;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("100 rubles are 1 dollar. Test result : " + passed);
    }
}
