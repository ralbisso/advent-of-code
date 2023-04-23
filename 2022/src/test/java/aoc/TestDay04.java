package aoc;

import static aoc.Solutions2022.DAY04_PART1;
import static aoc.Solutions2022.DAY04_PART2;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestDay04 {

    private final Day04 day = new Day04();

    @Test
    public void testPart1() {
        assertEquals(DAY04_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        assertEquals(DAY04_PART2, day.solvePart2());
    }
}
