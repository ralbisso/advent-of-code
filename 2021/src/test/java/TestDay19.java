package aoc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestDay19 {

    private final Day19 day = new Day19();

    @Test
    public void testPart1() {
        assertEquals(Solutions2021.DAY19_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        assertEquals(Solutions2021.DAY19_PART2, day.solvePart2());
    }
}
