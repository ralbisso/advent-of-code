package aoc;

import static aoc.Solutions2017.DAY03_PART1;
import static aoc.Solutions2017.DAY03_PART2;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class TestDay03 {

    private final Day03 day = new Day03();

    @Test
    public void testPart1() {
        assertEquals(DAY03_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        assertEquals(DAY03_PART2, day.solvePart2());
    }
}
