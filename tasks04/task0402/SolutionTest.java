package tasks04.task0402;

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
        assertEquals("Суммарная стоимость яблок: 20\n" +
                "Корректируем стоимость на: 50\n" +
                "Новая суммарная стоимость: 70\n", outContent.toString());
    }

}