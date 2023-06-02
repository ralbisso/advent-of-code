package aoc;

import static aoc.Solutions2019.DAY02_PART1;
import static aoc.Solutions2019.DAY02_PART2;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestDay02 {

	private final Day02 day = new Day02();

	@Test
	public void testPart1() {
		assertEquals(DAY02_PART1, day.solvePart1());
	}

	@Test
	public void testPart2() {
		assertEquals(DAY02_PART2, day.solvePart2());
	}
}
