package aoc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestDay05 {

    private final Day05 day = new Day05();

    @Test
    public void testPart1() {
        assertEquals(Solutions2020.DAY05_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        assertEquals(Solutions2020.DAY05_PART2, day.solvePart2());
    }
}
