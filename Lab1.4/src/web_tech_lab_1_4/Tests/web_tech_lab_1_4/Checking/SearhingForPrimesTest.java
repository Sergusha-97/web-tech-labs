package web_tech_lab_1_4.Checking;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Сергей on 11.10.2016.
 */
public class SearhingForPrimesTest {
    @Test
    public void printResult() throws Exception {
        int[] data = {0,1,2,10,13,21,25,30,19,29};

        SearhingForPrimes searcher = new SearhingForPrimes();
        ArrayList<Integer> result = searcher.PrintResult(data);
        ArrayList<Integer> testResult = new ArrayList<Integer>();
        testResult.add(2);
        testResult.add(4);
        testResult.add(8);
        testResult.add(9);
        for (int i=0;i<result.size();i++){
            assertTrue(result.get(i)== testResult.get(i));
        }
    }

}