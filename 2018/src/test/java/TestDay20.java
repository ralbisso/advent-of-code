package aoc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestDay20 {

    private final Day20 day = new Day20();

    @Test
    public void testPart1() {
        assertEquals(Solutions2018.DAY20_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        assertEquals(Solutions2018.DAY20_PART2, day.solvePart2());
    }
}
