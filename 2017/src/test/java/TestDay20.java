package aoc2017;

import org.junit.Assert;
import org.junit.Test;

public class TestDay20 {

    private final Day20 day = new Day20();

    @Test
    public void testPart1() {
        Assert.assertEquals(Solutions2017.DAY20_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        Assert.assertEquals(Solutions2017.DAY20_PART2, day.solvePart2());
    }
}
