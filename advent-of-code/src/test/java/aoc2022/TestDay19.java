package aoc2022;

import org.junit.Assert;
import org.junit.Test;

public class TestDay19 {

    private final Day19 day = new Day19();

    @Test
    public void testPart1() {
        Assert.assertEquals(Solutions2022.DAY19_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        Assert.assertEquals(Solutions2022.DAY19_PART2, day.solvePart2());
    }
}
