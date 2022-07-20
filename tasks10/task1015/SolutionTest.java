package tasks10.task1015;

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
        assertEquals("a0 b0 c0 d0 \n" +
                "a1 b1 c1 d1 \n" +
                "a2 b2 c2 d2 \n" +
                "a3 b3 c3 d3 \n" +
                "a4 b4 c4 d4 \n" , outContent.toString());

    }

}