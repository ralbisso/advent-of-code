package aoc2015;

import org.junit.Assert;
import org.junit.Test;

public class TestDay02 {

    private final Day02 day = new Day02();

    @Test
    public void testPart1() {
        Assert.assertEquals(Solutions2015.DAY02_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        Assert.assertEquals(Solutions2015.DAY02_PART2, day.solvePart2());
    }
}
