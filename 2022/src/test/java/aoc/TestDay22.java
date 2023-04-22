package aoc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestDay22 {

    private final Day22 day = new Day22();

    @Test
    public void testPart1() {
        assertEquals(Solutions2022.DAY22_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        assertEquals(Solutions2022.DAY22_PART2, day.solvePart2());
    }
}
