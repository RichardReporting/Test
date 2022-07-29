package The_Required_Tasks.Lvl6.MultiplesOf3Or5;

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
        assertEquals((Integer) 23, Solution.sumOf3N5(10));
        assertEquals((Integer) 78, Solution.sumOf3N5(20));
        assertEquals((Integer) 9168, Solution.sumOf3N5(200));

    }
}