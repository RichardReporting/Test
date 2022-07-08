package tasks04.task0442;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

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
        String input = "5 4 3 2 1 -1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Solution.sumByNeg1();
        assertEquals("14", outContent.toString());
    }

    @Test
    public void test2() {
        Solution inputSol = new Solution();
        String input = "-1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Solution.sumByNeg1();
        assertEquals("-1", outContent.toString());
    }
    @Test
    public void test3() {
        Solution inputSol = new Solution();
        String input = "0 0 0 0 0 -1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Solution.sumByNeg1();
        assertEquals("-1", outContent.toString());
    }

}