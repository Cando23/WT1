package main.task9_10_11.classes;
import java.util.ArrayList;
public class Basket {
    private ArrayList<Ball> basket;

    public Basket() {
        basket = new ArrayList<Ball>();
    }
    public boolean addBall(Ball ball){
        return basket.add(ball);
    }
    public double getWeight(){
        double weight = 0;
        for (Ball ball:basket) {
            weight += ball.getWeight();
        }
        return weight;
    }
    public int countOf(Color color){
        int count = 0;
        for (Ball ball:basket) {
            if (ball.getColor() == color)
                count++;
        }
        return count;
    }
}
