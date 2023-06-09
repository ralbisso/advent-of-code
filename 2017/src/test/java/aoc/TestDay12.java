package aoc;

import static aoc.Solutions2017.DAY12_PART1;
import static aoc.Solutions2017.DAY12_PART2;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestDay12 {

    private final Day12 day = new Day12();

    @Test
    public void testPart1() {
        assertEquals(DAY12_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        assertEquals(DAY12_PART2, day.solvePart2());
    }
}
