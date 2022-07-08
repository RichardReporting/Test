package tasks04.task0441;

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
        Solution.midNumOf3(5,1,8);
        assertEquals("5", outContent.toString());
    }

    @Test
    public void test2()
    {Solution.midNumOf3(500, -500, 0);
        assertEquals("0", outContent.toString());
    }

    @Test
    public void test3() {
        Solution.midNumOf3(4,4,4);
        assertEquals("4", outContent.toString());
    }

}