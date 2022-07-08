package tasks05.task0502wip;

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
        Solution.Cat cat1 = new Solution.Cat();
        Solution.newCat(cat1);
        Solution.Cat cat2 = new Solution.Cat();
        Solution.newCat(cat2);

        Solution.newCat("Васька", 5, 5, "Чонкер");
        Solution.newCat("");
        assertEquals("Васька сильнее, чем Барсик",
                outContent.toString());

    }
}