package tasks04.task0436;

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
        Solution.the8Block(2, 4);
        assertEquals("8888\n" +
                        "8888\n",
                outContent.toString());

    }

    @Test
    public void test2() {
        Solution.the8Block(8, 1);
        assertEquals("8\n" +
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