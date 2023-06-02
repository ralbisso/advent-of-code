package aoc;

import static enums.Day.DAY_05;
import static utils.FileUtils.getLineAsIntArray;

import classes.IntCode;

public class Day05 extends AoC2019 {

	private final int[] input = getLineAsIntArray(DAY_05);

	public int solvePart1() {
		var program = new IntCode(input, 1);
		program.run();
		return program.getOutput();
	}

	public int solvePart2() {
		var program = new IntCode(input, 5);
		program.run();
		return program.getOutput();
	}
}
