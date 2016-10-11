package web_tech_lab_1_6.Computing;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Сергей on 11.10.2016.
 */
public class MatrixConverterTest {
    @Test
    public void getSquareMatrix() throws Exception {
        double[] data = {0,1,2,3,4,5};
        MatrixConverter converter = new MatrixConverter();
        double[][] result = converter.GetSquareMatrix(data);
        for (int i = 0; i<data.length;i++){
            assertTrue(result[i][0]==result[0][i]);
        }
    }

}