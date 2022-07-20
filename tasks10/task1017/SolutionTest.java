package tasks10.task1017;

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
        String input = "30\n5\n6\n5\n5\n5\n5\n6\n5\n5\n5\n5\n6\n5\n5\n5\n5\n6\n5\n5\n5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Solution.main(null);
        assertEquals("0", outContent.toString());
    }

    @Test
    public void test2() throws IOException {
        Solution inputSol = new Solution();
        String input = "5\n5\n6\n5\n5\n5\n5\n6\n5\n5\n5\n5\n6\n5\n5\n5\n5\n6\n5\n5\n3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Solution.main(null);
        assertEquals("5", outContent.toString());
    }
}