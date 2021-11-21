package main.task9_10_11.classes;

import main.task9_10_11.classes.Ball;
import main.task9_10_11.classes.Basket;
import main.task9_10_11.classes.Color;

public class Task9 {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addBall(new Ball(Color.black, 4.5));
        basket.addBall(new Ball(Color.blue, 4.0));
        basket.addBall(new Ball(Color.white, 2.5));
        basket.addBall(new Ball(Color.blue, 0.5));
        basket.addBall(new Ball(Color.blue, 25));
        basket.addBall(new Ball(Color.red, 5.5));
        System.out.println("Вес : " + basket.getWeight());
        System.out.println("Количество синих мячей " + basket.countOf(Color.blue));
    }
}
