package aoc;

import static classes.Split.COMMA;
import static enums.Day.DAY_11;
import static utils.FileUtils.getLine;

public class Day11 extends AoC2017 {

	private final String[] input = getLine(DAY_11).split(COMMA);

	private final static String NORTH = "n";
	private final static String NORTH_EAST = "ne";
	private final static String NORTH_WEST = "nw";
	private final static String SOUTH = "s";
	private final static String SOUTH_EAST = "se";
	private final static String SOUTH_WEST = "sw";

	public int solvePart1() {
		int[] position = { 0, 0 };
		for (String direction : input) {
			move(position, direction);
		}
		return getFewestNumberOfSteps(position);
	}

	public int solvePart2() {
		int[] position = { 0, 0 };
		int max = 0;
		for (String direction : input) {
			move(position, direction);
			int fewestNumberOfSteps = getFewestNumberOfSteps(position);
			if (fewestNumberOfSteps > max) {
				max = fewestNumberOfSteps;
			}
		}
		return max;
	}

	private void move(int[] position, String mv) {
		switch (mv) {
		case NORTH -> position[1] += 2;
		case SOUTH -> position[1] -= 2;
		case NORTH_EAST -> {
			position[0]++;
			position[1]++;
		}
		case NORTH_WEST -> {
			position[0]--;
			position[1]++;
		}
		case SOUTH_EAST -> {
			position[0]++;
			position[1]--;
		}
		case SOUTH_WEST -> {
			position[0]--;
			position[1]--;
		}
		}
	}

	private int getFewestNumberOfSteps(int[] position) {
		int x = Math.abs(position[0]), y = Math.abs(position[1]);
		return (x + y + 1) / 2;
	}
}
