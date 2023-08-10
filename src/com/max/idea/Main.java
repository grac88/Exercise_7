package com.max.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 22;
        int y = 15;
        int z = 6;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
            if (array[i] == x | array[i] == y | array[i] == z )
                System.out.println("Данное значение имеется в константах");
        }
    }
}


