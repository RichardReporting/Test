package tasks04.task0443;

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
        Solution.theNameIsAName("Вася",1984,1,8);
        assertEquals("Меня зовут Вася.\n" +
                "Я родился 8.1.1984\n", outContent.toString());
    }
}