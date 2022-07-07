package tasks04.task0423;

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
        assertEquals("И 18 достаточно", Solution.ifOldEnough(25));
    }

    @Test
    public void test2() {
        assertEquals("", Solution.ifOldEnough(17));
    }

}