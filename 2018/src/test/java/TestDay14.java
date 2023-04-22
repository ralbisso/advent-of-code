package aoc2018;

import org.junit.Assert;
import org.junit.Test;

public class TestDay14 {

    private final Day14 day = new Day14();

    @Test
    public void testPart1() {
        Assert.assertEquals(Solutions2018.DAY14_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        Assert.assertEquals(Solutions2018.DAY14_PART2, day.solvePart2());
    }
}
