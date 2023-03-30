package aoc2020;

import org.junit.Assert;
import org.junit.Test;

public class TestDay01 {

    private final Day01 day = new Day01();

    @Test
    public void testPart1() {
        Assert.assertEquals(987339, day.solvePart1());
    }

    @Test
    public void testPart2() {
        Assert.assertEquals(259521570, day.solvePart2());
    }
}
