package tasks04.task0418;

import org.junit.Before;
import org.junit.Test;
import tasks04.task0418.Solution;

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
        assertEquals(5, Solution.minNum(5, 7));
    }

    @Test
    public void test2() {
        assertEquals(9, Solution.minNum(9, 9));
    }

    @Test
    public void test3() {
        assertEquals(-3, Solution.minNum(3, -3));
    }
}