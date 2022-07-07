package tasks04.task0408;

import org.junit.Before;
import org.junit.Test;
import tasks04.task0408.Solution;

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
        assertEquals("Число меньше 5", Solution.compare(4));
    }

    @Test
    public void test2() {
        assertEquals("Число равно 5", Solution.compare(5));
    }

    @Test
    public void test3() {
        assertEquals("Число больше 5", Solution.compare(6));
    }
}