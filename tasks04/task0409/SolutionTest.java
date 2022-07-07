package tasks04.task0409;

import org.junit.Before;
import org.junit.Test;
import tasks04.task0409.Solution;

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
        assertEquals(6, Solution.closeToTen(20,6));
    }

    @Test
    public void test2() {
        assertEquals(-90, Solution.closeToTen(-90, 91));
    }

}