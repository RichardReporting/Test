package tasks04.task0411;

import org.junit.Before;
import org.junit.Test;
import tasks04.task0411.Solution;

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
        assertEquals("зима", Solution.checkSeason(1));
    }

    @Test
    public void test2() {
        assertEquals("лето", Solution.checkSeason(6));
    }

    @Test
    public void test3() {
        assertEquals("осень", Solution.checkSeason(9));
    }
    @Test
    public void test4() {
        assertEquals("весна", Solution.checkSeason(4));
    }
}