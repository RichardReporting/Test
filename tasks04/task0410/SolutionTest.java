package tasks04.task0410;

import org.junit.Before;
import org.junit.Test;
import tasks04.task0410.Solution;

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
        assertEquals("Число 49 не содержится в интервале", Solution.checkInterval(49));
    }

    @Test
    public void test2() {
        assertEquals("Число 75 содержится в интервале", Solution.checkInterval(75));
    }

}