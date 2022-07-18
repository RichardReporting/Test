package tasks08.task0821;

import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.text.ParseException;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));

    }

    @Test
    public void test1() throws IOException, ParseException {
        Solution.main(null);
        assertEquals("Оруэлл Джордж\n" +
                "Васильков Евгений\n" +
                "Смит Джон\n" +
                "Иванов Иван\n" +
                "Сидоров Петр\n" +
                "Петров Иван\n" +
                "Курочкин Сергей\n", outContent.toString());

    }

}