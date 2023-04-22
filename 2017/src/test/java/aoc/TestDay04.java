package aoc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestDay04 {

    private final Day04 day = new Day04();

    @Test
    public void testPart1() {
        assertEquals(Solutions2017.DAY04_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        assertEquals(Solutions2017.DAY04_PART2, day.solvePart2());
    }
}
