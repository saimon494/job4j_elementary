package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("ages length = " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("surnames length = " + surnames.length);
        float[] prices = new float[40];
        System.out.println("prices length = " + prices.length);

        String[] names = new String[4];
        names[0] = "Vova";
        System.out.println(names[0]);
        names[1] = "Petya";
        System.out.println(names[1]);
        names[2] = "Roman";
        System.out.println(names[2]);
        names[3] = "Vasya";
        System.out.println(names[3]);
    }
}
