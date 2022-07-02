package main.java.ru.smirnova.w1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] a = {3, 5, 1, 89, 45, -8};

        SortableArray arr = new SortableArray(a);

        System.out.println(Arrays.toString(arr.sort(a)));

    }
}