package The_Required_Tasks.Lvl7.Isograms;

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
        assertEquals(true, Solution.isogramChecker("Dermatoglyphics"));
        assertEquals(false, Solution.isogramChecker("aba"));
        assertEquals(false, Solution.isogramChecker("moOse"));
        assertEquals(true, Solution.isogramChecker("thumbscrewjapingly"));
        assertEquals(true, Solution.isogramChecker(""));
    }
}