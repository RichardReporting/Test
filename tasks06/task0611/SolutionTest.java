package tasks06.task0611;

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
        String input = "AbBa";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Solution.main(null);
        assertEquals("AbBaAbBaAbBaAbBaAbBa\n" +
                        "AbBaAbBaAbBaAbBa",
                outContent.toString());

    }

    @Test
    public void test2() {
        Solution inputSol = new Solution();
        String input = "KeKe";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Solution.main(null);
        assertEquals("KeKeKeKeKeKeKeKeKeKe\n" +
                        "KeKeKeKeKeKeKeKe",
                outContent.toString());

    }
}