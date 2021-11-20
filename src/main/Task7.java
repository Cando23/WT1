package main;

import java.util.Scanner;
import java.util.Arrays;
public class Task7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = in.nextInt();
        System.out.print("Введите " + n + " элементов: ");
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextDouble();
        }
        System.out.println(Arrays.toString(array));
        array = shellSort(array);
        System.out.println(Arrays.toString(array));
    }
    private static void swap(double[] array, int ind1, int ind2) {
        double tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
    public static double[] shellSort(double[] array){
        int gap = array.length / 2;
        while (gap >= 1) {
            for (int right = 0; right < array.length; right++) {
                for (int i = right - gap; i >= 0; i -= gap) {
                    if (array[i] > array[i + gap]) {
                        swap(array, i, i + gap);
                    }
                }
            }
            gap = gap / 2;
        }
        return array;
    }
}
