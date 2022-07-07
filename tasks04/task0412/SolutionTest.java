package tasks04.task0412;

import org.junit.Before;
import org.junit.Test;
import tasks04.task0412.Solution;

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
        assertEquals(50, Solution.ifPositiveOrNot(25));
    }

    @Test
    public void test2() {
        assertEquals(0, Solution.ifPositiveOrNot(-1));
    }

    @Test
    public void test3() {
        assertEquals(0, Solution.ifPositiveOrNot(0));
    }
}