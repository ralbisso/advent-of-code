package aoc2021;

import org.junit.Assert;
import org.junit.Test;

public class TestDay17 {

    private final Day17 day = new Day17();

    @Test
    public void testPart1() {
        Assert.assertEquals(Solutions2021.DAY17_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        Assert.assertEquals(Solutions2021.DAY17_PART2, day.solvePart2());
    }
}
