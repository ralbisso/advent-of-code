package aoc2018;

import org.junit.Assert;
import org.junit.Test;

public class TestDay07 {

    private final Day07 day = new Day07();

    @Test
    public void testPart1() {
        Assert.assertEquals(Solutions2018.DAY07_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        Assert.assertEquals(Solutions2018.DAY07_PART2, day.solvePart2());
    }
}
