package aoc;

import static aoc.Solutions2022.DAY16_PART1;
import static aoc.Solutions2022.DAY16_PART2;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestDay16 {

    private final Day16 day = new Day16();

    @Test
    public void testPart1() {
        assertEquals(DAY16_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        assertEquals(DAY16_PART2, day.solvePart2());
    }
}
