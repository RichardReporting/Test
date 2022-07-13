package tasks06.task0612;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));

    }

    @Test
    public void test1() {
        Solution inputSol = new Solution();
        String input = "100 10";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Solution.main(null);
        assertEquals("110\n" +
                        "90\n" +
                        "1000\n" +
                        "10.0\n" +
                        "10.0",
                outContent.toString());

    }

    @Test
    public void test2() {
        Solution inputSol = new Solution();
        String input = "255\n" +
                "5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Solution.main(null);
        assertEquals("260\n" +
                        "250\n" +
                        "1275\n" +
                        "51.0\n" +
                        "12.75",
                outContent.toString());

    }
}