package aoc2016;

import org.junit.Assert;
import org.junit.Test;

public class TestDay01 {

    private final Day01 day = new Day01();

    @Test
    public void testPart1() {
        Assert.assertEquals(239, day.solvePart1());
    }

    @Test
    public void testPart2() {
        Assert.assertEquals(141, day.solvePart2());
    }
}
