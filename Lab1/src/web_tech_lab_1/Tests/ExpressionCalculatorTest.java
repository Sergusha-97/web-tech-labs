import static org.junit.Assert.*;
import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import web_tech_lab_1.Calculations.ExpressionCalculator;
import web_tech_lab_1.Data.DataForExpression;

/**
 * Created by Сергей on 16.09.2016.
 */
public class ExpressionCalculatorTest {
    @org.junit.Test
    public void computeExpression() throws Exception {
        double epsilon = 0.001;
        //data for test computed in MathCAD
        ExpressionCalculator calculator = new ExpressionCalculator();
        assertTrue(Math.abs(calculator.ComputeExpression(new DataForExpression(1,1)) - 1.913)<epsilon);
        assertTrue(Math.abs(calculator.ComputeExpression(new DataForExpression(0,0)) - 0.5)<epsilon);
        assertTrue(Math.abs(calculator.ComputeExpression(new DataForExpression(1,0)) - 1.569)<epsilon);
        assertTrue(Math.abs(calculator.ComputeExpression(new DataForExpression(-1,0)) + 0.431)<epsilon);
        assertTrue(Math.abs(calculator.ComputeExpression(new DataForExpression(0,1)) - 0.854)<epsilon);
        assertTrue(Math.abs(calculator.ComputeExpression(new DataForExpression(0,-1)) - 0.854)<epsilon);
    }

}