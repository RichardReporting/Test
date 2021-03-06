package tasks07.task0723;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));

    }

    @Test
    public void test1() throws InterruptedException {
        Solution.main(null);
        assertEquals("30\n" +
                "29\n" +
                "28\n" +
                "27\n" +
                "26\n" +
                "25\n" +
                "24\n" +
                "23\n" +
                "22\n" +
                "21\n" +
                "20\n" +
                "19\n" +
                "18\n" +
                "17\n" +
                "16\n" +
                "15\n" +
                "14\n" +
                "13\n" +
                "12\n" +
                "11\n" +
                "10\n" +
                "9\n" +
                "8\n" +
                "7\n" +
                "6\n" +
                "5\n" +
                "4\n" +
                "3\n" +
                "2\n" +
                "1\n" +
                "0\n" +
                "Бум!", outContent.toString());

    }

}