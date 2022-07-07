package tasks04.task0414;

import org.junit.Before;
import org.junit.Test;
import tasks04.task0414.Solution;

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
        assertEquals("Количество дней в году: 366", Solution.amountOfDays(400));
    }

    @Test
    public void test2() {
        assertEquals("Количество дней в году: 366", Solution.amountOfDays(396));
    }

    @Test
    public void test3() {
        assertEquals("Количество дней в году: 365", Solution.amountOfDays(300));
    }
}