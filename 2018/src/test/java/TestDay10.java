package aoc2018;

import org.junit.Assert;
import org.junit.Test;

public class TestDay10 {

    private final Day10 day = new Day10();

    @Test
    public void testPart1() {
        Assert.assertEquals(Solutions2018.DAY10_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        Assert.assertEquals(Solutions2018.DAY10_PART2, day.solvePart2());
    }
}
