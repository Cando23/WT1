package main;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = in.nextInt();
        System.out.print("Введите " + n + " элементов: ");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        System.out.println(findCount(array));
    }
    public static int findCount(int[] array){
        int[] tmp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (array[j] < array[i]) {
                    tmp[i] = Math.max(tmp[i], tmp[j] + 1);
                }
            }
        }

        int res = tmp[0];
        for (int i = 0; i < array.length; i++) {
            res = Math.max(res, tmp[i]);
        }
        return array.length - res;
    }
}
