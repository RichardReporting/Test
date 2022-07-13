package tasks06.task0621;

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
        String input = "дедушка Вася\nбабушка\nМурка\nпапа Котофей\nмама Василиса\nсын Мурчик\nдочь Пушинка";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Solution.main(null);
        assertEquals("Cat name is дедушка Вася no mother, no father\n" +
                        "Cat name is бабушка no mother, no father\n" +
                        "Cat name is Мурка no mother, father is дедушка Вася\n" +
                        "Cat name is папа Котофей mother is бабушка, no father\n" +
                        "Cat name is мама Василиса mother is папа Котофей, father is Мурка\n" +
                        "Cat name is сын Мурчик mother is папа Котофей, father is Мурка\n",
                outContent.toString());

    }

}