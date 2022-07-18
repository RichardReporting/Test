package tasks08.task0830;

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
        String input = "1\n2\n3\n4\n5\n5\n5\na\nd\nb\nc\ne\nh\ng\nf\nk\nlol\nlel\nlul\nlal";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Solution.main(null);
        assertEquals("1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5\n" +
                "5\n" +
                "5\n" +
                "a\n" +
                "b\n" +
                "c\n" +
                "d\n" +
                "e\n" +
                "f\n" +
                "g\n" +
                "h\n" +
                "k\n" +
                "lal\n" +
                "lel\n" +
                "lol\n" +
                "lul\n", outContent.toString());

    }

}