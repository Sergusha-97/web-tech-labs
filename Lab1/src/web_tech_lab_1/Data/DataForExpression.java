package web_tech_lab_1.Data;

/**
 * Created by Сергей on 16.09.2016.
 */
public class DataForExpression {
    private double x;
    private double y;

    DataForExpression(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double GetX(){
        return x;
    }

    public double GetY(){
        return y;
    }

}
