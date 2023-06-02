package aoc;

import static enums.Day.DAY_08;
import static utils.FileUtils.getAllLines;

import java.util.List;

public class Day08 extends AoC2015 {

	private final List<String> input = getAllLines(DAY_08);

	private final static String ESCAPED_QUOTE = "\"";
	private final static char BACKSLASH = '\\';
	private final static char QUOTE = '"';
	private final static char ZERO = '0';
	private final static char X = 'x';

	public int solvePart1() {
		int difference = 0;
		for (var literal : input) {
			difference += literal.length() - getInMemoryString(literal).length();
		}
		return difference;
	}

	public int solvePart2() {
		int difference = 0;
		for (var literal : input) {
			difference += getEncodedString(literal).length() - literal.length();
		}
		return difference;
	}

	private String getInMemoryString(String string) {
		var sb = new StringBuilder();
		for (int i = 1; i < string.length() - 1; i++) {
			char c = string.charAt(i);
			if (c == BACKSLASH) {
				c = string.charAt(++i);
				if (c == X) {
					int hexaCode = Integer.decode(ZERO + string.substring(i, i + 2));
					i += 2;
					c = (char) hexaCode;
				}
			}
			sb.append(c);
		}
		return sb.toString();
	}

	private String getEncodedString(String string) {
		var sb = new StringBuilder(ESCAPED_QUOTE);
		for (char c : string.toCharArray()) {
			if (c == QUOTE || c == BACKSLASH) {
				sb.append(BACKSLASH);
			}
			sb.append(c);
		}
		sb.append(ESCAPED_QUOTE);
		return sb.toString();
	}
}
