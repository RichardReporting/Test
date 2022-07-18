package tasks08.task0802;

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
        assertEquals("дыня - овощ\n" +
                "ежевика - куст\n" +
                "банан - трава\n" +
                "арбуз - ягода\n" +
                "груша - фрукт\n" +
                "картофель - клубень\n" +
                "земляника - ягода\n" +
                "ирис - цветок\n" +
                "вишня - ягода\n" +
                "жень-шень - корень\n", outContent.toString());

    }

}