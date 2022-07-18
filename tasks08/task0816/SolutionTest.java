package tasks08.task0816;

import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.text.ParseException;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));

    }

    @Test
    public void test1() throws IOException, ParseException {
        Solution.main(null);
        assertEquals("S3 Sun May 15 00:00:00 MSD 1988\n" +
                "S4 Mon Apr 20 00:00:00 MSK 1964\n" +
                "S5 Sat Apr 26 00:00:00 MSD 1986\n" +
                "S10 Wed Jan 05 00:00:00 MSK 2000\n" +
                "S8 Tue Jan 09 00:00:00 MSK 2001\n" +
                "S2 Sat Jan 29 00:00:00 MSK 2000\n", outContent.toString());

    }

}