package tasks03.task0303;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
@Test
    public void test1(){assertEquals(115,Solution.convertEurToUsd(100, 1.15), 0.01);}

@Test
    public void test2(){assertEquals(170,Solution.convertEurToUsd(200, 0.85), 0.01);}
}