package aoc;

import static enums.Day.DAY_04;
import static utils.FileUtils.getLine;

import org.apache.commons.codec.digest.DigestUtils;

public class Day04 extends AoC2015 {

	private final String input = getLine(DAY_04);
	
	private final static String START_PART_1 = "00000";
	private final static String START_PART_2 = "000000";

	public int solvePart1() {
		return getAnswer(START_PART_1);
	}

	public int solvePart2() {
		return getAnswer(START_PART_2);
	}
	
	private int getAnswer(String start) {
		int answer = 0;
		while (!DigestUtils.md5Hex(input + ++answer).startsWith(start));
		return answer;
	}
}
