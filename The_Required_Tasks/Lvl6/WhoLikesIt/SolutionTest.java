package The_Required_Tasks.Lvl6.WhoLikesIt;

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
        String[] str = {"Peter", "John", "Jimmy"};
        assertEquals("Peter, John and Jimmy like this", Solution.whoLikesIt(str));
    }

    @Test
    public void test2() {
        String[] str = {};
        assertEquals("no one likes this", Solution.whoLikesIt(str));
    }
}