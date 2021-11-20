package main;

import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = in.nextInt();
        System.out.print("Введите " + n + " элементов: ");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        printPrimeNumbersIndices(array);
    }
    public static void printPrimeNumbersIndices(int[] array){
        int arraySize = array.length;
        for(int i = 0; i < arraySize; i++){
            if (isPrime(array[i])){
                System.out.println(i+1);
            }
        }
    }
    public static boolean isPrime(int number){
        int maxDivider = (int) Math.sqrt(number);
        for (int divider = 2; divider <= maxDivider; divider++) {
            if (number % divider == 0) {
                return false;
            }
        }
        return true;
    }
}
