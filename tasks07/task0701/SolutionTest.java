package tasks07.task0701;

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
        String input = "5\n4\n9\n8\n7\n3\n5\n6\n8\n45\n5\n18\n6\n0\n0\n4\n7\n9\n19\n20";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Solution.main(null);
        assertEquals("45", outContent.toString());

    }

}