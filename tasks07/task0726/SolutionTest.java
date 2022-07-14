package tasks07.task0726;

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
        String input = "Kot\n3\n5\n18\n\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Solution.main(null);
        assertEquals("Cat name is Kot, age is 3, weight is 5, tail = 18\n", outContent.toString());

    }

}