package aoc;

import static enums.Day.DAY_02;
import static utils.FileUtils.getLineAsIntArray;

import classes.IntCode;

public class Day02 extends AoC2019 {

	private final int[] input = getLineAsIntArray(DAY_02);

	public int solvePart1() {
		input[1] = 12;
		input[2] = 2;
		new IntCode(input).run();
		return input[0];
	}

	public int solvePart2() {
		for (int noun = 0; noun <= 99; noun++) {
			for (int verb = 0; verb <= 99; verb++) {
				int[] copy = input.clone();
				copy[1] = noun;
				copy[2] = verb;
				new IntCode(copy).run();
				if (copy[0] == 19690720) {
					return noun * 100 + verb;
				}
			}
		}
		return 0;
	}
}
