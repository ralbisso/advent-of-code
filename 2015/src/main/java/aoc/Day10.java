package aoc;

import static enums.Day.DAY_10;
import static utils.FileUtils.getLine;

public class Day10 extends AoC2015 {

	private final StringBuilder input = new StringBuilder(getLine(DAY_10));

	public int solvePart1() {
		return lookAndSay(input, 40);
	}

	public int solvePart2() {
		return lookAndSay(input, 50);
	}

	private int lookAndSay(StringBuilder sequence, int times) {
		for (int i = 0; i < times; i++) {
			sequence = lookAndSay(sequence);
		}
		return sequence.length();
	}

	private StringBuilder lookAndSay(StringBuilder sequence) {
		StringBuilder next = new StringBuilder();
		for (int i = 0; i < sequence.length(); i++) {
			char c = sequence.charAt(i);
			int count = 1;
			while (i + 1 < sequence.length() && c == sequence.charAt(i + 1)) {
				count++;
				i++;
			}
			next.append(count);
			next.append(c);
		}
		return next;
	}
}
