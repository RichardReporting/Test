package tasks04.task0424;

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
        assertEquals(1, Solution.indexOfAnother(1,4,4));
    }

    @Test
    public void test2() {
        assertEquals(3, Solution.indexOfAnother(5,5,4));
    }

    @Test
    public void test3() {
        assertEquals(2, Solution.indexOfAnother(2,5,2));
    }

}