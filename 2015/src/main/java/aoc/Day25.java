package aoc;

import static enums.Day.DAY_25;
import static utils.FileUtils.getLine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day25 extends AoC2015 {

	private final String input = getLine(DAY_25);

	public int solve() {
		int[] stopCondition = getStopCondition(input);
		int row, column, offset, code = 20151125;
		row = column = offset = 1;
		while (row != stopCondition[0] || column != stopCondition[1]) {
			code = (int) ((code * 252533L) % 33554393L);
			if (--row == 0) {
				row = ++offset;
				column = 1;
			} else {
				column++;
			}
		}
		return code;
	}

	private int[] getStopCondition(String input) {
		int index = 0;
		int[] stopCondition = new int[2];
		Pattern numbers = Pattern.compile("\\d+");
		Matcher matcher = numbers.matcher(input);
		while (matcher.find()) {
			String match = matcher.group();
			stopCondition[index++] = Integer.parseInt(match);
		}
		return stopCondition;
	}
}
