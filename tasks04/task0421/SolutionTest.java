package tasks04.task0421;

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
        assertEquals("Имена идиентичны", Solution.equalityOfNames("Настя", "Настя"));
    }

    @Test
    public void test2() {
        assertEquals("Длины имен равны", Solution.equalityOfNames("Маша","Рома" ));
    }

    @Test
    public void test3() {
        assertEquals("", Solution.equalityOfNames("Настя","Рома"));
    }
}