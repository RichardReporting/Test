package tasks04.task0427;

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
        assertEquals("Нечетное однозначное число", Solution.tripleNumberCatcher(1));
    }

    @Test
    public void test2() {
        assertEquals("Четное двухзначное число", Solution.tripleNumberCatcher(44));
    }

    @Test
    public void test3() {
        assertEquals("Нечетное трехзначное число", Solution.tripleNumberCatcher(789));
    }

    @Test
    public void test4() {
        assertEquals("", Solution.tripleNumberCatcher(1000));
    }

}