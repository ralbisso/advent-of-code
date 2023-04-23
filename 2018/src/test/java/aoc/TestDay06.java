package aoc;

import static aoc.Solutions2018.DAY06_PART1;
import static aoc.Solutions2018.DAY06_PART2;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestDay06 {

    private final Day06 day = new Day06();

    @Test
    public void testPart1() {
        assertEquals(DAY06_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        assertEquals(DAY06_PART2, day.solvePart2());
    }
}
