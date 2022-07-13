package tasks05.task0620;

import org.junit.Before;
import org.junit.Test;
import tasks06.task0620.Solution;

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
        Solution.main(null);
        assertEquals("Max is 28", outContent.toString());

    }
}