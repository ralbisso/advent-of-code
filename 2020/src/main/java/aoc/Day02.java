package aoc;

import static enums.Day.DAY_02;
import static utils.FileUtils.getAllLines;

import java.util.stream.Stream;

import classes.Password;

public class Day02 extends AoC2020 {

	private final Stream<Password> input = getAllLines(DAY_02).stream().map(Password::new);

	public int solvePart1() {
		return (int) input.filter(Password::isValid).count();
	}

	public int solvePart2() {
		return (int) input.filter(Password::isValidNewPolicy).count();
	}
}
