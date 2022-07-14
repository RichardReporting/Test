package tasks07.task0712;

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
        String input = "ko\nkokoko\nkoko\nkokoko\nko\nko\nkokoko\nkoko\nkokoko\nko\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Solution.main(null);
        assertEquals("ko\nko\nko\nko\n", outContent.toString());

    }

    public void test2() {
        Solution inputSol = new Solution();
        String input = "kekekekeke\nke\nke\nke\nkekekekeke\nkekekekeke\nke\nke\nke\nkekekekeke\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Solution.main(null);
        assertEquals("kekekekeke\nkekekekeke\nkekekekeke\nkekekekeke\n", outContent.toString());

    }

}