package tasks10.task1016;

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
        Solution inputSol = new Solution();
        String input = "fdsa\n" +
                "dfsa\n" +
                "dfsa\n" +
                "fsa\n" +
                "dsfa\n" +
                "fs\n" +
                "dsa\n" +
                "sf\n" +
                "fs\n" +
                "sf\n" +
                "sfsfsf\n" +
                "fsfs\n" +
                "fs\n" +
                "fs\n" +
                "fs\n" +
                "fs\n" +
                "fs\n" +
                "fs\n" +
                "fs\n" +
                "fs";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Solution.main(null);
        assertEquals("fdsa 0\n" +
                "dsa 0\n" +
                "sf 1\n" +
                "fsa 0\n" +
                "dsfa 0\n" +
                "sfsfsf 0\n" +
                "fsfs 0\n" +
                "fs 9\n" +
                "dfsa 1\n", outContent.toString());

    }

}