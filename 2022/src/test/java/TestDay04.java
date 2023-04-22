package aoc2022;

import org.junit.Assert;
import org.junit.Test;

public class TestDay04 {

    private final Day04 day = new Day04();

    @Test
    public void testPart1() {
        Assert.assertEquals(Solutions2022.DAY04_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        Assert.assertEquals(Solutions2022.DAY04_PART2, day.solvePart2());
    }
}
