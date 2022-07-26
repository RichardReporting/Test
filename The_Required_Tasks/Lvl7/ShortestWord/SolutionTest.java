package The_Required_Tasks.Lvl7.ShortestWord;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
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
        assertEquals((Integer) 15, Solution.findShort("Dermatoglyphics"));
        assertEquals((Integer) 1, Solution.findShort("i want to travel the world writing code one day"));
        assertEquals((Integer) 3, Solution.findShort("turns out random test cases are easier than writing out basic ones"));
    }
}