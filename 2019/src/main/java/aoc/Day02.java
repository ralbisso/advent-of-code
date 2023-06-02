package aoc;

import static enums.Day.DAY_02;
import static utils.FileUtils.getLineAsIntArray;

import classes.IntCode;

public class Day02 extends AoC2019 {

	private final int[] input = getLineAsIntArray(DAY_02);

	private final static int LIMIT = 100;
	private final static int EXPECTED_OUTPUT = 19690720;

	public int solvePart1() {
		return runProgram(12, 2);
	}

	public int solvePart2() {
		for (int noun = 0; noun < LIMIT; noun++) {
			for (int verb = 0; verb < LIMIT; verb++) {
				int output = runProgram(noun, verb);
				if (output == EXPECTED_OUTPUT) {
					return noun * 100 + verb;
				}
			}
		}
		return 0;
	}

	private int runProgram(int noun, int verb) {
		int[] copy = input.clone();
		copy[1] = noun;
		copy[2] = verb;
		return new IntCode(copy).run();
	}
}
