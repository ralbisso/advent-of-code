package aoc;

import static aoc.Solutions2015.DAY18_PART1;
import static aoc.Solutions2015.DAY18_PART2;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestDay18 {

    private final Day18 day = new Day18();

    @Test
    public void testPart1() {
        assertEquals(DAY18_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        assertEquals(DAY18_PART2, day.solvePart2());
    }
}
