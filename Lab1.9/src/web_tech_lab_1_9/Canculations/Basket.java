package web_tech_lab_1_9.Canculations;

import java.util.ArrayList;
import web_tech_lab_1_9.Data.Ball;
import web_tech_lab_1_9.Data.Color;

/**
 * Created by Сергей on 16.09.2016.
 */
public class Basket {
    private ArrayList<Ball> balls = new ArrayList<Ball>();
    public void AddBall(Ball ball){
        balls.add(ball);
    }
    public double BallsWeight(){
        double result = 0;
        for (Ball ball : balls){
            result += ball.Weight();
        }
        return result;
    }
    public int CountBlueBalls(){
        int result = 0;
        for (Ball ball : balls){
            if (ball.Color() == Color.BLUE)
                result++;
        }
        return result;
    }
}
