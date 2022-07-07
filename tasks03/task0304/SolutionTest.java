package tasks03.task0304;

import org.junit.Test;
import tasks03.task0304.Solution;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test1(){assertEquals(110, Solution.incByTenPercent(100), 0.1);}
    @Test
    public void test2(){assertEquals(99, Solution.incByTenPercent(90), 0.1);}
}