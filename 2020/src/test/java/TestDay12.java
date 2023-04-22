package aoc2020;

import org.junit.Assert;
import org.junit.Test;

public class TestDay12 {

    private final Day12 day = new Day12();

    @Test
    public void testPart1() {
        Assert.assertEquals(Solutions2020.DAY12_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        Assert.assertEquals(Solutions2020.DAY12_PART2, day.solvePart2());
    }
}
