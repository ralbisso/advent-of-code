package aoc;

import static aoc.Solutions2019.DAY21_PART1;
import static aoc.Solutions2019.DAY21_PART2;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestDay21 {

    private final Day21 day = new Day21();

    @Test
    public void testPart1() {
        assertEquals(DAY21_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        assertEquals(DAY21_PART2, day.solvePart2());
    }
}
