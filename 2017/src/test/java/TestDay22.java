package aoc2017;

import org.junit.Assert;
import org.junit.Test;

public class TestDay22 {

    private final Day22 day = new Day22();

    @Test
    public void testPart1() {
        Assert.assertEquals(Solutions2017.DAY22_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        Assert.assertEquals(Solutions2017.DAY22_PART2, day.solvePart2());
    }
}
