package aoc2019;

import org.junit.Assert;
import org.junit.Test;

public class TestDay01 {

    private final Day01 day = new Day01();

    @Test
    public void testPart1() {
        Assert.assertEquals(69501, day.solvePart1());
    }

    @Test
    public void testPart2() {
        Assert.assertEquals(202346, day.solvePart2());
    }
}
