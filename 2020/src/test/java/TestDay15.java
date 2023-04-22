package aoc2020;

import org.junit.Assert;
import org.junit.Test;

public class TestDay15 {

    private final Day15 day = new Day15();

    @Test
    public void testPart1() {
        Assert.assertEquals(Solutions2020.DAY15_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        Assert.assertEquals(Solutions2020.DAY15_PART1, day.solvePart2());
    }
}
