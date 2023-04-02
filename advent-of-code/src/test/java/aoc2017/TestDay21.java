package aoc2017;

import org.junit.Assert;
import org.junit.Test;

public class TestDay21 {

    private final Day21 day = new Day21();

    @Test
    public void testPart1() {
        Assert.assertEquals(Solutions2017.DAY21_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        Assert.assertEquals(Solutions2017.DAY21_PART2, day.solvePart2());
    }
}
