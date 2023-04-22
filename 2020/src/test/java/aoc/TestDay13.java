package aoc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestDay13 {

    private final Day13 day = new Day13();

    @Test
    public void testPart1() {
        assertEquals(Solutions2020.DAY13_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        assertEquals(Solutions2020.DAY13_PART2, day.solvePart2());
    }
}
