package tasks06.task0610;

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
    public void test2() {
        Solution inputSol = new Solution();
        String input = "15";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals(15.0,
                ConsoleReader.readDouble(), 0.01);

    }

    @Test
    public void test3() {
        Solution inputSol = new Solution();
        String input = "Пятнадцать";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals("Пятнадцать",
                ConsoleReader.readString());

    }

    @Test
    public void test4() {
        Solution inputSol = new Solution();
        String input = "true";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals(true,
                ConsoleReader.readBoolean());

    }

    @Test
    public void test1() {
        Solution inputSol = new Solution();
        String input = "15";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals(15,
                ConsoleReader.readInt());

    }

}