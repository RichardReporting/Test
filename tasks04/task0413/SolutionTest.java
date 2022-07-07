package tasks04.task0413;

import org.junit.Before;
import org.junit.Test;
import tasks04.task0413.Solution;

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
        assertEquals("Понедельник", Solution.dayOfTheWeek(1));
    }

    @Test
    public void test2() {
        assertEquals("Суббота", Solution.dayOfTheWeek(6));
    }

    @Test
    public void test3() {
        assertEquals("Такого дня недели не существует", Solution.dayOfTheWeek(20));
    }
}