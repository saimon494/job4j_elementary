package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        int nullIndex = 0;
        int notNullIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                nullIndex = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] != null) {
                        notNullIndex = j;
                        break;
                    }
                }
                swap(array, nullIndex, notNullIndex);
            }
//            System.out.print(array[i] + " ");
        }
        return array;
    }

    public static void swap(String[] array, int source, int dest) {
        String temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        for (String s : input) {
            System.out.print(s + " ");
        }
        System.out.println();
        String[] compressed = compress(input);
        for (String s : compressed) {
            System.out.print(s + " ");
        }
    }
}
