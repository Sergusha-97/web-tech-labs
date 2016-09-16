package web_tech_lab_1_3.Data;

import java.util.ArrayList;
/**
 * Created by Сергей on 16.09.2016.
 */

public class DataForComputingTangent {
    private double a;
    private double b;
    private double h;
    DataForComputingTangent( double a, double b, double h){
        this.a = a;
        this.b = b;
        this.h = h;
    }
    public ArrayList<Double> GetParametrs(){
        int number = (int)Math.ceil((b-a) / h);
        ArrayList<Double> result = new ArrayList<Double>(number);
        for (double i=a;i<b;i+=h){
            result.add(i);
        }
        return result;
    }
}
