package tasks07.task0713;

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
        String input = "1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Solution.main(null);
        assertEquals("3\n6\n9\n12\n15\n18\n2\n4\n6\n8\n10\n12\n14\n16\n18\n20\n1\n5\n7\n11\n13\n17\n19\n", outContent.toString());

    }

}