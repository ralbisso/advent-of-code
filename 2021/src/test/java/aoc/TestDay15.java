package aoc;

import static aoc.Solutions2021.DAY15_PART1;
import static aoc.Solutions2021.DAY15_PART2;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestDay15 {

    private final Day15 day = new Day15();

    @Test
    public void testPart1() {
        assertEquals(DAY15_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        assertEquals(DAY15_PART2, day.solvePart2());
    }
}
