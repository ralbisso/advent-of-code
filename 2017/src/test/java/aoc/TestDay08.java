package aoc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestDay08 {

    private final Day08 day = new Day08();

    @Test
    public void testPart1() {
        assertEquals(Solutions2017.DAY08_PART1, day.solvePart1());
    }

    @Test
    public void testPart2() {
        assertEquals(Solutions2017.DAY08_PART2, day.solvePart2());
    }
}
