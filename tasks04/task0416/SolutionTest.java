package tasks04.task0416;

import org.junit.Before;
import org.junit.Test;
import tasks04.task0416.Solution;

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
        assertEquals("зелёный", Solution.ifGreenOrNot(2.5));
    }

    @Test
    public void test2() {
        assertEquals("жёлтый", Solution.ifGreenOrNot(8.1));
    }

    @Test
    public void test3() {
        assertEquals("красный", Solution.ifGreenOrNot(24.9));
    }
}