package aoc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestDay17 {

    private final Day17 day = new Day17();

    @Test
    public void testPart1() {
        assertEquals(Solutions2022.DAY17_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        assertEquals(Solutions2022.DAY17_PART2, day.solvePart2());
    }
}
