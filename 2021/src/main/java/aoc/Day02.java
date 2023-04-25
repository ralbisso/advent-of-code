package aoc;

import static enums.Day.DAY_02;
import static utils.FileUtils.getAllLines;

import java.util.List;

public class Day02 extends AoC2021 {

	private final List<String> input = getAllLines(DAY_02);

	private final static String FORWARD = "forward";
	private final static String DOWN = "down";
	private final static String UP = "up";

	public int solvePart1() {
		int horizontalPosition = 0, depth = 0;
		for (String instruction : input) {
			String[] split = instruction.split(" ");
			int units = Integer.parseInt(split[1]);
			switch (split[0]) {
			case FORWARD -> horizontalPosition += units;
			case DOWN -> depth += units;
			case UP -> depth -= units;
			}
		}
		return horizontalPosition * depth;
	}

	public int solvePart2() {
		int horizontalPosition = 0, depth = 0, aim = 0;
		for (String instruction : input) {
			String[] split = instruction.split(" ");
			int units = Integer.parseInt(split[1]);
			switch (split[0]) {
			case FORWARD -> {
				horizontalPosition += units;
				depth += aim * units;
			}
			case DOWN -> aim += units;
			case UP -> aim -= units;
			}
		}
		return horizontalPosition * depth;
	}
}
