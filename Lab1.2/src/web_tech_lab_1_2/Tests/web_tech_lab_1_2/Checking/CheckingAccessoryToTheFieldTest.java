package web_tech_lab_1_2.Checking;

import org.junit.Test;
import web_tech_lab_1_2.Data.DataForChecking;

import static org.junit.Assert.*;

/**
 * Created by Сергей on 11.10.2016.
 */
public class CheckingAccessoryToTheFieldTest {
    @Test
    public void check() throws Exception {
        CheckingAccessoryToTheField checker = new CheckingAccessoryToTheField();

        assertFalse(checker.Check(new DataForChecking(0,5.001)));
        assertTrue(checker.Check(new DataForChecking(0,0)));
        assertTrue(checker.Check(new DataForChecking(-4,0)));
        assertTrue(checker.Check(new DataForChecking(6,0)));
        assertTrue(checker.Check(new DataForChecking(1,1)));
        assertFalse(checker.Check(new DataForChecking(10,10)));
        assertFalse(checker.Check(new DataForChecking(-15,0)));
    }

}