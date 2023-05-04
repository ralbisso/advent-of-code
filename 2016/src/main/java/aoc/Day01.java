package aoc;

import static enums.Day.DAY_01;
import static utils.FileUtils.getLine;

import java.util.HashSet;

import classes.Position;

public class Day01 extends AoC2016 {

	private final String[] input = getLine(DAY_01).split(", ");

	public int solvePart1() {
		var position = new Position(0, 0);
		for (String instruction : input) {
			position.turnAndWalk(instruction);
		}
		return getManhattanDistance(position);
	}

	public int solvePart2() {
		var position = new Position(0, 0);
		var memo = new HashSet<>();
		for (String instruction : input) {
			position.turn(instruction.charAt(0));
			int steps = Integer.parseInt(instruction.substring(1));
			for (int i = 0; i < steps; i++) {
				position.walk(1);
				if (!memo.add(position.copyPosition())) {
					return getManhattanDistance(position);
				}
			}
		}
		return 0;
	}

	private int getManhattanDistance(Position position) {
		return Math.abs(position.getX()) + Math.abs(position.getY());
	}
}
