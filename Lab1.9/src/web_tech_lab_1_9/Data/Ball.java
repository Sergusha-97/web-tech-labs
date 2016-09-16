package web_tech_lab_1_9.Data;

/**
 * Created by Сергей on 16.09.2016.
 */
public class Ball {
    private Color color;
    private double weight;
    Ball(double weight, Color color){
        this.weight = weight;
        this.color = color;
    }
}
enum Color{
    RED,
    BLUE,
    GREEN,
    YELLOW,
    BROWN
}