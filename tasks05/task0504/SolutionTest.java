package tasks05.task0504;

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
                "2\n" +
                "3\n" +
                "Рыжий\n" +
                "Москва\n" +
                "Мурзик\n" +
                "4\n" +
                "2\n" +
                "Серый\n" +
                "Питер\n" +
                "Персик\n" +
                "1\n" +
                "2\n" +
                "Бежевый\n" +
                "Воронеж";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Solution.main(null);
        assertEquals("Барсик 3 3 Рыжий Москва\n" +
                "Мурзик 2 3 Серый Питер\n" +
                "Персик 2 3 Бежевый Воронеж", outContent.toString());

    }
}