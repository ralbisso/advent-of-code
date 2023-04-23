package aoc;

import static aoc.Solutions2018.DAY23_PART1;
import static aoc.Solutions2018.DAY23_PART2;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestDay23 {

    private final Day23 day = new Day23();

    @Test
    public void testPart1() {
        assertEquals(DAY23_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        assertEquals(DAY23_PART2, day.solvePart2());
    }
}
