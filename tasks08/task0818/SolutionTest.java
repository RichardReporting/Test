package tasks08.task0818;

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
        assertEquals("S4 6000\n" +
                "S6 1600\n" +
                "S10 90000\n" +
                "S7 2800\n" +
                "S1 600\n", outContent.toString());

    }

}