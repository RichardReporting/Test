package tasks03.task0316;

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
        assertEquals("It's Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"\n" +
                        "It's Java string: \"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\"",
                outContent.toString());

    }
}