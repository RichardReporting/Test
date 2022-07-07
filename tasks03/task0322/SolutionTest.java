package tasks03.task0322;

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
        Solution.theTriangleOfLove("Я", "Пиво", "Чипсики");
        assertEquals("Я + Пиво + Чипсики = Чистая любовь, да-да!", outContent.toString());

    }
}