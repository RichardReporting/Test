package tasks07.task0728;

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
        assertEquals("0 5 3 5 3 555 800 8 0 6 5 5 3 7 42 23 16 15 8 4 ", outContent.toString());

    }

}