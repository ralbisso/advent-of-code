package aoc;

import static aoc.Solutions2018.DAY01_PART1;
import static aoc.Solutions2018.DAY01_PART2;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestDay01 {

    private final Day01 day = new Day01();

    @Test
    public void testPart1() {
        assertEquals(DAY01_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        assertEquals(DAY01_PART2, day.solvePart2());
    }
}
