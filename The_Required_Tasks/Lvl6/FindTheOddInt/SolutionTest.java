package The_Required_Tasks.Lvl6.FindTheOddInt;

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
        int[] nums = {20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5};
        assertEquals((Integer) 5, Solution.whichIsOdd(nums));
    }

    @Test
    public void test2() {
        int[] nums = {1,1,1,1,1,1,10,1,1,1,1};
        assertEquals((Integer) 10, Solution.whichIsOdd(nums));
    }
}