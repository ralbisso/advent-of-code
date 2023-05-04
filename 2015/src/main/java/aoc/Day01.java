package aoc;

import static enums.Day.DAY_01;
import static utils.FileUtils.getLineAsCharArray;

public class Day01 extends AoC2015 {

	private final char[] input = getLineAsCharArray(DAY_01);

	private final static char OPENING_PARENTHESIS = '(';

	public int solvePart1() {
		int floor = 0;
		for (char c : input) {
			floor += (c == OPENING_PARENTHESIS) ? 1 : -1;
		}
		return floor;
	}

	public int solvePart2() {
		int floor = 0, position = 1;
		for (char c : input) {
			floor += (c == OPENING_PARENTHESIS) ? 1 : -1;
			if (floor == -1) {
				break;
			}
			position++;
		}
		return position;
	}
}
