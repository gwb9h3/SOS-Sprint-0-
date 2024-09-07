package Tests;

import static org.junit.Assert.*;
import org.junit.Test;

public class test2 {

    @Test
    public void testAddition() {
        int num1 = 2;
        int num2 = 3;
        int expectedResult = 5;
        int result = num1 + num2;
        assertEquals(expectedResult, result);
    }
}