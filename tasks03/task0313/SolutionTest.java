package tasks03.task0313wip;

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
        Solution.main(null);
        assertEquals("мамамылараму\n" +
                        "мамарамумыла\n" +
                        "мыламамараму\n" +
                        "мыларамумама\n" +
                        "рамумамамыла\n" +
                        "рамумыламама\n",
                outContent.toString());

    }
}