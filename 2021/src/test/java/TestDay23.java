package aoc2021;

import org.junit.Assert;
import org.junit.Test;

public class TestDay23 {

    private final Day23 day = new Day23();

    @Test
    public void testPart1() {
        Assert.assertEquals(Solutions2021.DAY23_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        Assert.assertEquals(Solutions2021.DAY23_PART2, day.solvePart2());
    }
}
