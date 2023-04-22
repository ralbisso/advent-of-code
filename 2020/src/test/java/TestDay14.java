package aoc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestDay14 {

    private final Day14 day = new Day14();

    @Test
    public void testPart1() {
        assertEquals(Solutions2020.DAY14_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        assertEquals(Solutions2020.DAY14_PART2, day.solvePart2());
    }
}
