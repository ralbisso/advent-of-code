package aoc;

import static enums.Day.DAY_05;
import static utils.FileUtils.getAllLines;

import java.util.stream.Stream;

public class Day05 extends AoC2015 {

	private final Stream<String> input = getAllLines(DAY_05).stream();

	private final static String AT_LEAST_3_VOWELS = "^(.*[aeiou]){3}.*$";
	private final static String AT_LEAST_1_LETTER_APPEARING_TWICE_IN_A_ROW = ".*(.)\\1.*";
	private final static String CONTAINS_AB_CD_PQ_OR_XY = ".*(ab|cd|pq|xy).*";
	private final static String A_PAIR_OF_2_LETTERS_WITHOUT_OVERLAPPING = ".*(\\w\\w).*\\1.*";
	private final static String AT_LEAST_1_REPEATING_LETTER_WITH_1_LETTER_IN_BETWEEN = ".*(\\w)\\w\\1.*";

	public long solvePart1() {
		return input.filter(this::isNiceOldRules).count();
	}

	public long solvePart2() {
		return input.filter(this::isNiceNewRules).count();
	}

	private boolean isNiceOldRules(String string) {
		return string.matches(AT_LEAST_3_VOWELS) 
				&& string.matches(AT_LEAST_1_LETTER_APPEARING_TWICE_IN_A_ROW)
				&& !string.matches(CONTAINS_AB_CD_PQ_OR_XY);
	}

	private boolean isNiceNewRules(String string) {
		return string.matches(A_PAIR_OF_2_LETTERS_WITHOUT_OVERLAPPING)
				&& string.matches(AT_LEAST_1_REPEATING_LETTER_WITH_1_LETTER_IN_BETWEEN);
	}
}
