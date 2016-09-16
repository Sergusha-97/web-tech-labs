package web_tech_lab_1_6.Computing;

/**
 * Created by Сергей on 16.09.2016.
 */
public class MatrixConverter {
    public double[][] GetSquareMatrix(double[] array){
        int n = array.length;
        double[][] result = new double[n][n];
        int counter = 0;
        int position = 0;
        for (int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                if (position + j < n)
                    result[i][j] = array[position + j];
                else {
                    result[i][j] = array[counter];
                    counter++;
                }
            }
            position++;
            counter = 0;
        }
        return result;
    }
}

