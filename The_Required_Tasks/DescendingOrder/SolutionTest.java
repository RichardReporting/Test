package The_Required_Tasks.DescendingOrder;

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
        String input = "156842";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Solution.main(null);
        assertEquals("865421", outContent.toString());

    }


}