package aoc2016;

import org.junit.Assert;
import org.junit.Test;

public class TestDay03 {

    private final Day03 day = new Day03();

    @Test
    public void testPart1() {
        Assert.assertEquals(Solutions2016.DAY03_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        Assert.assertEquals(Solutions2016.DAY03_PART2, day.solvePart2());
    }
}
