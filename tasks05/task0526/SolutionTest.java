package tasks05.task0526;

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
        String input = "Вася\n" +
                "22\n" +
                "Питер\n" +
                "Петя\n" +
                "24\n" +
                "Москва\n" +
                "Маша\n" +
                "26\n" +
                "Воронеж\n" +
                "Катя\n" +
                "21\n" +
                "Новосибирск\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Solution.main(null);
        assertEquals("Вася 22 Питер\n" +
                "Петя 24 Москва\n" +
                "Маша 26 Воронеж\n" +
                "Катя 21 Новосибирск", outContent.toString());

    }
}