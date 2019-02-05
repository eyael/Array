package com.company;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int x = 0; x < array.length; x++) {
            sum += array[x];
        }
        System.out.println(sum);
    }
}
