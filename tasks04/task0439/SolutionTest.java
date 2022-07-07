package tasks04.task0439;

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
        Solution.sayMyName("Саша");
        assertEquals("Саша любит меня\n" +
                        "Саша любит меня\n" +
                        "Саша любит меня\n" +
                        "Саша любит меня\n" +
                        "Саша любит меня\n" +
                        "Саша любит меня\n" +
                        "Саша любит меня\n" +
                        "Саша любит меня\n" +
                        "Саша любит меня\n" +
                        "Саша любит меня\n",
                outContent.toString());

    }
}