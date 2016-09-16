package web_tech_lab_1.Calculations;

import web_tech_lab_1.Data.DataForExpression;


/**
 * Created by Сергей on 16.09.2016.
 */
public class ExpressionCalculator {
    private double SquareDouble(double var){
        return var*var;
    }
    private double ComputeNumerator(DataForExpression data){
        double result;
        result = Math.sin(data.GetX()+data.GetY());
        result = SquareDouble(result) + 1;
        return result;
    }
    private double ComputeDenominator(DataForExpression data){
        double numerator;
        double denominator;
        double result;
        numerator = data.GetX() * 2;
        denominator = SquareDouble(data.GetX()) * SquareDouble(data.GetY()) + 1;
        result = data.GetX() - numerator / denominator;
        result = Math.abs(result) + 2;
        return result;
    }
    public double ComputeExpression(DataForExpression data){
        double result;
        result = ComputeNumerator(data) / ComputeDenominator(data) + data.GetX();
        return result;
    }
}
