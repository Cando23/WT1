package main;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter a, b, h: ");
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double h = scan.nextDouble();
        while (a <= b){
            System.out.println(a + " " + solveFunction(a));
            a += h;
        }
    }
    public static double solveFunction(double x){
        return Math.tan(x);
    }
}
