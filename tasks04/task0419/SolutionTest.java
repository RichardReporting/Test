package tasks04.task0419;

import org.junit.Before;
import org.junit.Test;
import tasks04.task0419.Solution;

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
        assertEquals(20, Solution.maxOfFour(5, 7, 20, 1));
    }

    @Test
    public void test2() {
        assertEquals(1, Solution.maxOfFour(1, 1, 0, 1));
    }

    @Test
    public void test3() {
        assertEquals(624, Solution.maxOfFour(-10, 624, 0, 624));
    }
}