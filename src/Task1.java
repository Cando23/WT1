import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter x and y: ");
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double result = solve(x, y);
        System.out.println(result);
    }
    public static double solve(double x, double y){
        return solveNumerator(x,y)/solveDivider(x,y) + x;
    }
    public static double solveNumerator(double x, double y){
        return 1 + Math.pow(Math.sin(x + y),2);
    }
    public static double solveDivider(double x, double y){
        return 2 +  Math.abs(x - (2 * x) / (1 + x * x * y * y));
    }
}
