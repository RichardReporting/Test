package tasks04.task0429;

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
        assertEquals("Количество отрицательных чисел: 1\nКоличество положительных: 2", Solution.posNNegNumCatcher(1, 2, -3));
    }

    @Test
    public void test2() {
        assertEquals("Количество отрицательных чисел: 3\nКоличество положительных: 0", Solution.posNNegNumCatcher(-1, -2, -3));
    }

    @Test
    public void test3() {
        assertEquals("Количество отрицательных чисел: 0\nКоличество положительных: 0", Solution.posNNegNumCatcher(0, 0, 0));
    }

}