package The_Required_Tasks.Lvl7.BeginnerSeries3;

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
        assertEquals((Integer) 0, Solution.sumFromAtoB(0, 0));
        assertEquals((Integer) (-15), Solution.sumFromAtoB(-5, -1));
        assertEquals((Integer) 17, Solution.sumFromAtoB(17, 17));
        assertEquals((Integer) 127759, Solution.sumFromAtoB(505, 4));

    }
}