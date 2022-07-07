package tasks04.task0420;

import org.junit.Before;
import org.junit.Test;
import tasks04.task0420.Solution;

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
        assertEquals("20 7 5", Solution.fromTopToBot(5, 7, 20));
    }

    @Test
    public void test2() {
        assertEquals("1 1 0", Solution.fromTopToBot(1, 1, 0));
    }

    @Test
    public void test3() {
        assertEquals("624 0 -10", Solution.fromTopToBot(-10, 624, 0));
    }
}