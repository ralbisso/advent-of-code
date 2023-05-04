package aoc;

import static enums.Day.DAY_04;
import static utils.FileUtils.getLine;

import org.apache.commons.codec.digest.DigestUtils;

public class Day04 extends AoC2015 {

	private final String input = getLine(DAY_04);
	
	private final static String START_PART_1 = "00000";
	private final static String START_PART_2 = "000000";

	public int solvePart1() {
		int answer = 0;
		while (!DigestUtils.md5Hex(input + ++answer).startsWith(START_PART_1));
		return answer;
	}

	public int solvePart2() {
		int answer = 0;
		while (!DigestUtils.md5Hex(input + ++answer).startsWith(START_PART_2));
		return answer;
	}
}
