package tasks05.task0502;

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
        String input = "Васька\n3\n5\nЧонкер\nБарсик\n2\n11\nБродяга";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Solution.main(null);

        assertEquals("Васька сильнее, чем Барсик",
                outContent.toString());

    }
    @Test
    public void test2() {

        Solution inputSol = new Solution();
        String input = "Кот1\n2\n2\nКотъ\nКот2\n5\n5\nКотъ";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Solution.main(null);

        assertEquals("Кот2 сильнее, чем Кот1",
                outContent.toString());

    }
}