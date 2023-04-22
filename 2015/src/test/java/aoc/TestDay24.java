package aoc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestDay24 {

    private final Day24 day = new Day24();

    @Test
    public void testPart1() {
        assertEquals(Solutions2015.DAY24_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        assertEquals(Solutions2015.DAY24_PART2, day.solvePart2());
    }
}
