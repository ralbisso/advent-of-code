package aoc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestDay11 {

    private final Day11 day = new Day11();

    @Test
    public void testPart1() {
        assertEquals(Solutions2020.DAY11_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        assertEquals(Solutions2020.DAY11_PART1, day.solvePart2());
    }
}
