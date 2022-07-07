package tasks04.task0417;

import org.junit.Before;
import org.junit.Test;
import tasks04.task0417.Solution;

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
        assertEquals("1 1", Solution.ifEqual(1,2,1));
    }

    @Test
    public void test2() {
        assertEquals("2 2", Solution.ifEqual(2 , 1 , 2));
    }

    @Test
    public void test3() {
        assertEquals("3 3 3", Solution.ifEqual(3, 3, 3));
    }
}