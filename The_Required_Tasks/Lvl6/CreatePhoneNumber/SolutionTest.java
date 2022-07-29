package The_Required_Tasks.Lvl6.CreatePhoneNumber;

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
        int[] num = {1,2,3,4,5,6,7,8,9,0};
        assertEquals( "(123) 456-7890", Solution.wrongNumber(num));

    }
}