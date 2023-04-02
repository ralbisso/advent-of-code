package aoc2018;

import org.junit.Assert;
import org.junit.Test;

public class TestDay13 {

    private final Day13 day = new Day13();

    @Test
    public void testPart1() {
        Assert.assertEquals(Solutions2018.DAY13_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        Assert.assertEquals(Solutions2018.DAY13_PART2, day.solvePart2());
    }
}
