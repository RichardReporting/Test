package tasks07.task0724;

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
    public void test1() throws InterruptedException {
        Solution.main(null);
        assertEquals("Имя: Павел, пол: мужской. Имя: Василий, пол: мужской. " +
                "Имя: Светлана, пол: женский. Имя: Евгения, пол: женский. " +
                "Имя: Сергей, пол: мужской, отец: Павел, мать: Светлана. " +
                "Имя: Юлия, пол: женский, отец: Василий, мать: Евгения. " +
                "Имя: Семён, пол: мужской, отец: Сергей, мать: Юлия. " +
                "Имя: Мария, пол: женский, отец: Сергей, мать: Юлия. " +
                "Имя: Дарья, пол: женский, отец: Сергей, мать: Юлия. ", outContent.toString());

    }

}