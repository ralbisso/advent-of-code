package aoc;

import static enums.Day.DAY_21;
import static utils.FileUtils.getAllLines;

import java.util.ArrayList;
import java.util.List;

import classes.Operation;

public class Day21 extends AoC2016 {

	private final List<Operation> input = getAllLines(DAY_21).stream().map(Operation::new).toList();

	private final static String TO_SCRAMBLE = "abcdefgh";
	private final static String TO_UNSCRAMBLE = "fbgdceah";

	public String solvePart1() {
		var password = listify(TO_SCRAMBLE);
		for (Operation operation : input) {
			operation.apply(password);
		}
		return stringify(password);
	}

	public String solvePart2() {
		var password = listify(TO_UNSCRAMBLE);
		for (int i = input.size() - 1; i >= 0; i--) {
			input.get(i).unapply(password);
		}
		return stringify(password);
	}

	private List<Character> listify(String string) {
		List<Character> list = new ArrayList<>();
		for (char c : string.toCharArray()) {
			list.add(c);
		}
		return list;
	}

	private String stringify(List<Character> list) {
		return list.toString().replaceAll("[ ,\\[\\]]", "");
	}
}
