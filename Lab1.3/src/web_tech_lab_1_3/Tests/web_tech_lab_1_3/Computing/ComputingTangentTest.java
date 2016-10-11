package web_tech_lab_1_3.Computing;

import org.junit.Test;
import web_tech_lab_1_3.Data.DataForComputingTangent;

import static org.junit.Assert.*;

/**
 * Created by Сергей on 11.10.2016.
 */
public class ComputingTangentTest {
    @Test
    public void computingForAllParametrs() throws Exception {
        double epsilon = 0.001;
        DataForComputingTangent data = new DataForComputingTangent(0,5,0.5);
        ComputingTangent computer = new ComputingTangent();
        double[][] result = computer.ComputingForAllParametrs(data);
        assertTrue(result[0][1]- 0<epsilon);
        assertTrue(result[1][1]-0.546 < epsilon);
        assertTrue(result[2][1]-1.557 < epsilon);
        assertTrue(result[3][1]-14.101 < epsilon);
        assertTrue(result[4][1]+2.185 < epsilon);
        assertTrue(result[5][1]+0.747 < epsilon);
        assertTrue(result[6][1]+0.142 < epsilon);
        assertTrue(result[7][1]-0.374 < epsilon);
        assertTrue(result[8][1]-1.557 < epsilon);
        assertTrue(result[9][1]-4.637 < epsilon);
        assertTrue(result[10][1]+3.380 < epsilon);


    }

}