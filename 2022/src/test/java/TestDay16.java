package aoc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestDay16 {

    private final Day16 day = new Day16();

    @Test
    public void testPart1() {
        assertEquals(Solutions2022.DAY16_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        assertEquals(Solutions2022.DAY16_PART2, day.solvePart2());
    }
}
