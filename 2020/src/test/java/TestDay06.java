package aoc2020;

import org.junit.Assert;
import org.junit.Test;

public class TestDay06 {

    private final Day06 day = new Day06();

    @Test
    public void testPart1() {
        Assert.assertEquals(Solutions2020.DAY06_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        Assert.assertEquals(Solutions2020.DAY06_PART1, day.solvePart2());
    }
}
