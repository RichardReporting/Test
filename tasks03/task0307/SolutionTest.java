package tasks03.task0307;

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
        Solution.main(null);
        assertEquals("Zerg1\n" +
                        "Zerg2\n" +
                        "Zerg3\n" +
                        "Zerg4\n" +
                        "Zerg5\n" +
                        "Zerg6\n" +
                        "Zerg7\n" +
                        "Zerg8\n" +
                        "Zerg9\n" +
                        "Zerg10\n" +
                        "Protoss1\n" +
                        "Protoss2\n" +
                        "Protoss3\n" +
                        "Protoss4\n" +
                        "Protoss5\n" +
                        "Protoss6\n" +
                        "Terran1\n" +
                        "Terran2\n" +
                        "Terran3\n" +
                        "Terran4\n" +
                        "Terran5\n" +
                        "Terran6\n" +
                        "Terran7\n" +
                        "Terran8\n" +
                        "Terran9\n" +
                        "Terran10\n" +
                        "Terran11\n" +
                        "Terran12\n" +
                        "Terran13\n" +
                        "Terran14\n" +
                        "Terran15\n",
                outContent.toString());

    }
}