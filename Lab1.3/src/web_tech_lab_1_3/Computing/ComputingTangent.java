package web_tech_lab_1_3.Computing;

import web_tech_lab_1_3.Data.DataForComputingTangent;
import java.util.ArrayList;

/**
 * Created by Сергей on 16.09.2016.
 */
public class ComputingTangent {
    public double[][] ComputingForAllParametrs(DataForComputingTangent data){
        ArrayList<Double> parametrs = data.GetParametrs();
        int number = parametrs.size();
        double[][] result = new double[number][2];
        int i = 0;
        for (double param : parametrs){
            result[i][0] = param;
            result[i][1] = Math.tan(param);
            i++;
        }
        return result;
    }
}
