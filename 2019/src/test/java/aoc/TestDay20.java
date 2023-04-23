package aoc;

import static aoc.Solutions2019.DAY20_PART1;
import static aoc.Solutions2019.DAY20_PART2;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestDay20 {

    private final Day20 day = new Day20();

    @Test
    public void testPart1() {
        assertEquals(DAY20_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        assertEquals(DAY20_PART2, day.solvePart2());
    }
}
