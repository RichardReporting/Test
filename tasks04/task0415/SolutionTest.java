package tasks04.task0415;

import org.junit.Before;
import org.junit.Test;
import tasks04.task0415.Solution;

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
        assertEquals("Треугольник не существует", Solution.ifTriangle(4, 5, 10));
    }

    @Test
    public void test2() {
        assertEquals("Треугольник существует", Solution.ifTriangle(4, 5, 6));
    }

}