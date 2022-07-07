package tasks04.task0425;

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
        assertEquals(2, Solution.sectorFinder(1, 4));
    }

    @Test
    public void test2() {
        assertEquals(1, Solution.sectorFinder(-5, 10));
    }

    @Test
    public void test3() {
        assertEquals(4, Solution.sectorFinder(-50, -45));
    }

    @Test
    public void test4() {
        assertEquals(3, Solution.sectorFinder(90, -1));
    }

}