package tasks04.task0438;

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
        Solution.drawingLines();
        assertEquals("8888888888\n" +
                        "8\n" +
                        "8\n" +
                        "8\n" +
                        "8\n" +
                        "8\n" +
                        "8\n" +
                        "8\n" +
                        "8\n" +
                        "8\n",
                outContent.toString());

    }
}