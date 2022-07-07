package tasks04.task0426;

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
        assertEquals("Нечетное положительное число", Solution.numberCatcher(1));
    }

    @Test
    public void test2() {
        assertEquals("Четное отрицательное число", Solution.numberCatcher(-4));
    }

    @Test
    public void test3() {
        assertEquals("Ноль", Solution.numberCatcher(0));
    }

}