package tasks09.task0930;

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
        String input = "k\n" +
                "5\n" +
                "n\n" +
                "66\n" +
                "1\n" +
                "y\n" +
                "51y\n" +
                "0k";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Solution.main(null);
        assertEquals("0k\n" +
                "66\n" +
                "51y\n" +
                "5\n" +
                "1\n" +
                "k\n" +
                "n\n" +
                "y\n", outContent.toString());

    }

}