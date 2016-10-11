package web_tech_lab_1_9.Data;

/**
 * Created by Сергей on 16.09.2016.
 */
public class Ball {
    private Color color;
    private double weight;
    public Ball(double weight, Color color){
        if (weight <=0) weight = 1;
        this.weight = weight;
        this.color = color;
    }
    public double Weight(){
        return weight;
    }
    public Color Color(){
        return color;
    }
}
