package aoc2022;

import org.junit.Assert;
import org.junit.Test;

public class TestDay24 {

    private final Day24 day = new Day24();

    @Test
    public void testPart1() {
        Assert.assertEquals(Solutions2022.DAY24_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        Assert.assertEquals(Solutions2022.DAY24_PART2, day.solvePart2());
    }
}