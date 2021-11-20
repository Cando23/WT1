package main;

public class Task2 {
    public static void main(String[] args) {
        var res = isInRegion(5,1);
        System.out.println(res);
    }
    public static boolean isInRegion(double x, double y){
        if (x >= -4 && x <= 4 && y <= 5 && y >= 0)
            return true;
        if (x >= -6 && x <=6 && y <= 0 && y >= -3)
            return true;
        return false;
    }
}
