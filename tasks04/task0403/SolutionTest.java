package tasks04.task0403;

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
        assertEquals("Старое имя: Петя\n" +
                "Меняем имя на: Вова\n" +
                "Новое имя: Вова\n", outContent.toString());
    }

}