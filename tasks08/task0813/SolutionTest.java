package tasks08.task0813;

import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));

    }

    @Test
    public void test1() throws IOException {
        Solution.main(null);
        assertEquals("Л19\n" +
                "Л18\n" +
                "Л17\n" +
                "Л16\n" +
                "Л15\n" +
                "Л14\n" +
                "Л13\n" +
                "Л12\n" +
                "Л11\n" +
                "Л0\n" +
                "Л10\n" +
                "Л1\n" +
                "Л2\n" +
                "Л3\n" +
                "Л4\n" +
                "Л5\n" +
                "Л6\n" +
                "Л7\n" +
                "Л8\n" +
                "Л9\n", outContent.toString());

    }

}