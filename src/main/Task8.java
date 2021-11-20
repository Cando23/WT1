package main;

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = in.nextInt();
        System.out.print("Введите " + n + " элементов: ");
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextDouble();
        }
        System.out.print("Введите m: ");
        int m = in.nextInt();
        System.out.print("Введите " + n + " элементов: ");
        double[] array2 = new double[m];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextDouble();
        }
        printPositions(array, array2);
    }

    public static void printPositions(double[] array1, double[] array2) {
        int position = 0;
        int j = 0;
        System.out.print("Places to insert indexes: ");
        for (double element : array1) {
            while (j < array2.length && array2[j] < element) {
                System.out.print(position + " ");
                j++;
                position++;
            }
            position++;
            if (j == array2.length) {
                break;
            }
        }
        while (j < array2.length) {
            System.out.print(position + " ");
            position++;
            j++;
        }
    }
}
