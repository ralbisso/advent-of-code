package aoc2022;

import org.junit.Assert;
import org.junit.Test;

public class TestDay09 {

    private final Day09 day = new Day09();

    @Test
    public void testPart1() {
        Assert.assertEquals(Solutions2022.DAY09_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        Assert.assertEquals(Solutions2022.DAY09_PART2, day.solvePart2());
    }
}
