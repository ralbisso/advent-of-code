package aoc2017;

import org.junit.Assert;
import org.junit.Test;

public class TestDay08 {

    private final Day08 day = new Day08();

    @Test
    public void testPart1() {
        Assert.assertEquals(Solutions2017.DAY08_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        Assert.assertEquals(Solutions2017.DAY08_PART2, day.solvePart2());
    }
}
