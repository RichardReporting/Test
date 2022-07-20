package tasks10.task1018;

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
        String input = "1\n" +
                "a\n" +
                "2\n" +
                "b\n" +
                "3\n" +
                "c\n" +
                "4\n" +
                "d\n" +
                "5\n" +
                "e";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Solution.main(null);
        assertEquals("1 a\n" +
                "2 b\n" +
                "3 c\n" +
                "4 d\n" +
                "5 e\n", outContent.toString());

    }

}