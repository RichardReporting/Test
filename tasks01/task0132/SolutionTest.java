package tasks01.task0132;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        assertEquals(15,Solution.sumDigitsInNumber(546));
    }
    @Test
    public void test2() {
        assertEquals(10,Solution.sumDigitsInNumber(307));
    }

}