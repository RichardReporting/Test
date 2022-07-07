package tasks04.task0428;

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
        assertEquals(2, Solution.positiveNumberCatcher(1,2,-3));
    }

    @Test
    public void test2() {
        assertEquals(0, Solution.positiveNumberCatcher(-1,-2,-3));
    }

    @Test
    public void test3() {
        assertEquals(1, Solution.positiveNumberCatcher(-1,0,3));;
    }

    @Test
    public void test4() {
        assertEquals(3, Solution.positiveNumberCatcher(5,5,8));
    }

}