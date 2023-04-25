package aoc;

import static enums.Day.DAY_02;
import static utils.FileUtils.getAllLines;

import java.util.List;

public class Day02 extends AoC2016 {

	private final List<String> input = getAllLines(DAY_02);

	private final static Character[][] KEYPAD_1 = new Character[][] { 
		{ '1', '2', '3' },
		{ '4', '5', '6' },
		{ '7', '8', '9' }
	};

	private final static Character[][] KEYPAD_2 = new Character[][] { 
		{ null, null, '1', null, null },
		{ null, '2', '3', '4', null },
		{ '5', '6', '7', '8', '9' },
		{ null, 'A', 'B', 'C', null },
		{ null, null, 'D', null, null }
	};

	public String solvePart1() {
		String code = "";
		int[] position = new int[] { 1, 1 };
		for (String line : input) {
			move(line, position, KEYPAD_1);
			int x = position[0], y = position[1];
			code += KEYPAD_1[x][y];
		}
		return code;
	}

	public String solvePart2() {
		String code = "";
		int[] position = new int[] { 2, 0 };
		for (String line : input) {
			move(line, position, KEYPAD_2);
			int x = position[0], y = position[1];
			code += KEYPAD_2[x][y];
		}
		return code;
	}

	private void move(String instruction, int[] position, Character[][] keypad) {
		for (char c : instruction.toCharArray()) {
			switch (c) {
			case 'D' -> moveDown(position, keypad);
			case 'L' -> moveLeft(position, keypad);
			case 'R' -> moveRight(position, keypad);
			case 'U' -> moveUp(position, keypad);
			}
		}
	}

	private void moveDown(int[] position, Character[][] keypad) {
		int x = position[0], y = position[1];
		if (x + 1 < keypad.length && keypad[x + 1][y] != null) {
			position[0]++;
		}
	}

	private void moveLeft(int[] position, Character[][] keypad) {
		int x = position[0], y = position[1];
		if (y - 1 >= 0 && keypad[x][y - 1] != null) {
			position[1]--;
		}
	}

	private void moveRight(int[] position, Character[][] keypad) {
		int x = position[0], y = position[1];
		if (y + 1 < keypad[x].length && keypad[x][y + 1] != null) {
			position[1]++;
		}
	}

	private void moveUp(int[] position, Character[][] keypad) {
		int x = position[0], y = position[1];
		if (x - 1 >= 0 && keypad[x - 1][y] != null) {
			position[0]--;
		}
	}
}
