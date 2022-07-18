package tasks08.task0801;

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
        assertEquals("дыня\n" +
                "ежевика\n" +
                "банан\n" +
                "арбуз\n" +
                "груша\n" +
                "картофель\n" +
                "земляника\n" +
                "ирис\n" +
                "вишня\n" +
                "жень-шень\n", outContent.toString());

    }

}