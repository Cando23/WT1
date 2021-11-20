package main;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите N: ");
        int N = in.nextInt();
        System.out.print("Введите " + N + " элементов: ");
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = in.nextInt();
        }
        int[][] matrix = createMatrix(array);
        for(int i = 0; i < N; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
    public static int[][] createMatrix(int[] array){
        int length = array.length;;
        int[][] matrix = new int[length][length];

        for(int i = 0; i < length; i++){
            for(int j = 0; j < length; j++){
                matrix[i][j] = array[(i+j) % length];
            }
        }
        return matrix;
    }
}
