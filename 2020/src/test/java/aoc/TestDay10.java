package aoc;

import static aoc.Solutions2020.DAY10_PART1;
import static aoc.Solutions2020.DAY10_PART2;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestDay10 {

    private final Day10 day = new Day10();

    @Test
    public void testPart1() {
        assertEquals(DAY10_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        assertEquals(DAY10_PART2, day.solvePart2());
    }
}
