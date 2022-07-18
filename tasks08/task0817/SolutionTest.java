package tasks08.task0817;

import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.text.ParseException;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));

    }

    @Test
    public void test1() throws IOException, ParseException {
        Solution.main(null);
        assertEquals("a2 b2\n" +
                "a10 b6\n" +
                "a4 b3\n" +
                "a6 b4\n" +
                "a8 b5\n", outContent.toString());

    }

}