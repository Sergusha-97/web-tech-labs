package web_tech_lab_1_9.Canculations;

import org.junit.Before;
import org.junit.Test;
import web_tech_lab_1_9.Data.Ball;
import web_tech_lab_1_9.Data.Color;

import static org.junit.Assert.*;

/**
 * Created by Сергей on 11.10.2016.
 */
public class BasketTest {
    static Basket basket;
    @Before
    public  void FullFillBasket() {
        basket = new Basket();
        basket.AddBall(new Ball(10, Color.RED));
        basket.AddBall(new Ball(5, Color.BLUE));
        basket.AddBall(new Ball(15, Color.BLUE));
        basket.AddBall(new Ball(5, Color.GREEN));
        basket.AddBall(new Ball(5, Color.YELLOW));
        basket.AddBall(new Ball(-15, Color.BLUE));
    }
    @Test
    public void ballsWeight() throws Exception {
        assertTrue(basket.BallsWeight() == 41);
    }

    @Test
    public void countBlueBalls() throws Exception {
        assertTrue(basket.CountBlueBalls() == 3);
    }

}