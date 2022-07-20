package tasks10.task1020;

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
        String input = "5\n" +
                "6\n" +
                "8\n" +
                "5\n" +
                "6\n" +
                "4\n" +
                "22\n" +
                "5\n" +
                "6\n" +
                "5\n" +
                "2\n" +
                "65\n" +
                "5\n" +
                "8\n" +
                "8\n" +
                "52\n" +
                "554\n" +
                "54\n" +
                "45\n" +
                "423\n" +
                "65\n" +
                "897\n" +
                "354\n" +
                "5\n" +
                "98\n" +
                "42\n" +
                "1255\n" +
                "5645\n" +
                "35\n" +
                "245";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Solution.main(null);
        assertEquals("6 6", outContent.toString());

    }

}