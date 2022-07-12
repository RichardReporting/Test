package tasks05.task0510;

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
        String input = "Шлеппа\n6\n10\nРоссия\nРыжий";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Solution.main(null);
        assertEquals("Шлеппа 2 5 common null\n" +
                        "Шлеппа 10 6 common null\n" +
                        "Шлеппа 3 6 common null\n" +
                        "null 10 3 Рыжий null\n" +
                        "null 10 3 Рыжий Россия",
                outContent.toString());

    }
}