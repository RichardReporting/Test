package tasks10.task1012;

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
        Solution inputSol = new Solution();
        String input = "каждый\n" +
                "охотник\n" +
                "желает\n" +
                "знать\n" +
                "где\n" +
                "сидит\n" +
                "фазан\n" +
                "но\n" +
                "не\n" +
                "5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Solution.main(null);
        assertEquals("а 5\n" +
                "б 0\n" +
                "в 0\n" +
                "г 1\n" +
                "д 3\n" +
                "е 4\n" +
                "ж 2\n" +
                "з 2\n" +
                "и 3\n" +
                "й 1\n" +
                "к 2\n" +
                "л 1\n" +
                "м 0\n" +
                "н 5\n" +
                "о 3\n" +
                "п 0\n" +
                "р 0\n" +
                "с 1\n" +
                "т 4\n" +
                "у 0\n" +
                "ф 1\n" +
                "х 1\n" +
                "ц 0\n" +
                "ч 0\n" +
                "ш 0\n" +
                "щ 0\n" +
                "ъ 0\n" +
                "ы 1\n" +
                "ь 1\n" +
                "э 0\n" +
                "ю 0\n" +
                "я 0\n", outContent.toString());

    }

}