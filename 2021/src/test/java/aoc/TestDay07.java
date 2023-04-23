package aoc;

import static aoc.Solutions2021.DAY07_PART1;
import static aoc.Solutions2021.DAY07_PART2;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestDay07 {

    private final Day07 day = new Day07();

    @Test
    public void testPart1() {
        assertEquals(DAY07_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        assertEquals(DAY07_PART2, day.solvePart2());
    }
}
