package aoc2016;

import org.junit.Assert;
import org.junit.Test;

public class TestDay18 {

    private final Day18 day = new Day18();

    @Test
    public void testPart1() {
        Assert.assertEquals(Solutions2016.DAY18_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        Assert.assertEquals(Solutions2016.DAY18_PART2, day.solvePart2());
    }
}
