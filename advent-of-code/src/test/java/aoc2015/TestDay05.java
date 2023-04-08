package aoc2015;

import org.junit.Assert;
import org.junit.Test;

public class TestDay05 {

    private final Day05 day = new Day05();

    @Test
    public void testPart1() {
        Assert.assertEquals(Solutions2015.DAY05_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        Assert.assertEquals(Solutions2015.DAY05_PART2, day.solvePart2());
    }
}