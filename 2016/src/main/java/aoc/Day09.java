package aoc;

import static enums.Day.DAY_09;
import static utils.FileUtils.getLine;

public class Day09 extends AoC2016 {

	private final String input = getLine(DAY_09);

	private final static char OPENING_PARENTHESIS = '(';
	private final static char CLOSING_PARENTHESIS = ')';

	private final static int VERSION_1 = 1;
	private final static int VERSION_2 = 2;

	public long solvePart1() {
		return getDecompressedLength(input, VERSION_1);
	}

	public long solvePart2() {
		return getDecompressedLength(input, VERSION_2);
	}

	private long getDecompressedLength(String file, int version) {
		long length = 0;
		for (int i = 0; i < file.length(); i++) {
			char c = file.charAt(i);
			if (c != OPENING_PARENTHESIS) {
				length++;
			} else {
				StringBuilder marker = new StringBuilder();
				c = file.charAt(++i);
				while (c != CLOSING_PARENTHESIS) {
					marker.append(c);
					c = file.charAt(++i);
				}
				String[] split = marker.toString().split("x");
				int numberOfChars = Integer.parseInt(split[0]);
				int times = Integer.parseInt(split[1]);
				if (version == VERSION_1) {
					length += times * numberOfChars;
				} else if (version == VERSION_2) {
					String compressed = file.substring(i + 1, i + numberOfChars + 1);
					length += times * getDecompressedLength(compressed, VERSION_2);
				}
				i += numberOfChars;
			}
		}
		return length;
	}
}
