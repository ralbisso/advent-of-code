package aoc;

import static aoc.Solutions2019.DAY13_PART1;
import static aoc.Solutions2019.DAY13_PART2;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestDay13 {

    private final Day13 day = new Day13();

    @Test
    public void testPart1() {
        assertEquals(DAY13_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        assertEquals(DAY13_PART2, day.solvePart2());
    }
}
