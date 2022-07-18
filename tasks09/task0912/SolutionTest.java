package tasks09.task0912;

import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));

    }

    @Test
    public void test1() throws IOException {
        Solution.main(null);
        assertEquals("NumberFormatException", outContent.toString());

    }

}