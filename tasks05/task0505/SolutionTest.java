package tasks05.task0505;

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
    public void test1() {
        Solution inputSol = new Solution();
        String input = "Барсик\n" +
                "4\n" +
                "7\n" +
                "Котъ\n" +
                "Мурзик\n" +
                "3\n" +
                "4\n" +
                "Котъ\n" +
                "Шлеппа\n" +
                "6\n" +
                "12\n" +
                "Чонкер";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Solution.main(null);
        assertEquals("Барсик победил Мурзик\n" +
                "Шлеппа победил Барсик\n" +
                "Шлеппа победил Мурзик", outContent.toString());

    }
}