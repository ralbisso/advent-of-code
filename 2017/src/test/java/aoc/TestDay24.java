package aoc;

import static aoc.Solutions2017.DAY24_PART1;
import static aoc.Solutions2017.DAY24_PART2;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestDay24 {

    private final Day24 day = new Day24();

    @Test
    public void testPart1() {
        assertEquals(DAY24_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        assertEquals(DAY24_PART2, day.solvePart2());
    }
}
