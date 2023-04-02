package aoc2018;

import org.junit.Assert;
import org.junit.Test;

public class TestDay11 {

    private final Day11 day = new Day11();

    @Test
    public void testPart1() {
        Assert.assertEquals(Solutions2018.DAY11_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        Assert.assertEquals(Solutions2018.DAY11_PART1, day.solvePart2());
    }
}
