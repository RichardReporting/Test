package tasks08.task0824;

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
        Solution.main(null);
        assertEquals("Имя: Павел, пол: true, дети: Сергей. Имя: Василий, пол: true," +
                " дети: Юлия. Имя: Светлана, пол: false, дети: Сергей. Имя: Евгения, " +
                "пол: false, дети: Юлия. Имя: Сергей, пол: true, дети: Семён Мария Дарья." +
                " Имя: Юлия, пол: false, дети: Семён Мария Дарья. Имя: Семён, пол: true." +
                " Имя: Мария, пол: false. Имя: Дарья, пол: false. ", outContent.toString());

    }

}