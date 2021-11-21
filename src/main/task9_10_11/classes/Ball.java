package main.task9_10_11.classes;

public class Ball {
    private Color color;
    private double weight;
    public Ball(Color color, double weight){
        this.color = color;
        this.weight = weight;
    }


    public Color getColor(){
        return this.color;
    }
    public double getWeight(){
        return this.weight;
    }
}

