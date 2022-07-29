package The_Required_Tasks.Lvl6.DigitalRoot;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));

    }

    @Test
    public void test1() {
        int num = 99999999;
        assertEquals( (Integer) 9, Solution.sumOfDigits(num));

    }

    @Test
    public void test2() {
        int num = 10;
        assertEquals( (Integer) 1, Solution.sumOfDigits(num));

    }
}