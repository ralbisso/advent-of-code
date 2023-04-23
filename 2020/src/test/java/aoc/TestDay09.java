package aoc;

import static aoc.Solutions2020.DAY09_PART1;
import static aoc.Solutions2020.DAY09_PART2;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestDay09 {

    private final Day09 day = new Day09();

    @Test
    public void testPart1() {
        assertEquals(DAY09_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        assertEquals(DAY09_PART2, day.solvePart2());
    }
}
