package aoc2015;

import org.junit.Assert;
import org.junit.Test;

public class TestDay16 {

    private final Day16 day = new Day16();

    @Test
    public void testPart1() {
        Assert.assertEquals(Solutions2015.DAY16_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        Assert.assertEquals(Solutions2015.DAY16_PART2, day.solvePart2());
    }
}
