package tasks01.task0134;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    long a = 25, b = 2, c = 5;
    @Test
    public void test1(){ assertEquals(250000, Solution.getVolume(a,b,c));   }
}