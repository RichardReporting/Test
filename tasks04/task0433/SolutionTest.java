package tasks03.task0433;

import org.junit.Before;
import org.junit.Test;
import tasks04.task0433.Solution;

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
       Solution.addSSS();
        assertEquals("SSSSSSSSSS\n" +
                        "SSSSSSSSSS\n" +
                        "SSSSSSSSSS\n" +
                        "SSSSSSSSSS\n" +
                        "SSSSSSSSSS\n" +
                        "SSSSSSSSSS\n" +
                        "SSSSSSSSSS\n" +
                        "SSSSSSSSSS\n" +
                        "SSSSSSSSSS\n" +
                        "SSSSSSSSSS\n",
                outContent.toString());

    }
}