package aoc;

import static enums.Day.DAY_03;
import static enums.Direction.EAST;
import static enums.Direction.NORTH;
import static enums.Direction.SOUTH;
import static enums.Direction.WEST;
import static utils.FileUtils.getLineAsCharArray;

import java.util.HashSet;

import classes.Position;

public class Day03 extends AoC2015 {

	private final char[] input = getLineAsCharArray(DAY_03);

	public int solvePart1() {
		var houses = new HashSet<>();
		var santasPosition = new Position(0, 0);
		houses.add(santasPosition);
		for (char c : input) {
			move(santasPosition, c);
			houses.add(santasPosition.getNewPosition());
		}
		return houses.size();
	}

	public int solvePart2() {
		var houses = new HashSet<>();
		var santasPosition = new Position(0, 0);
		var robotPosition = new Position(0, 0);
		houses.add(santasPosition);
		for (int i = 0; i < input.length; i += 2) {
			move(santasPosition, input[i]);
			houses.add(santasPosition.getNewPosition());
			move(robotPosition, input[i + 1]);
			houses.add(robotPosition.getNewPosition());
		}
		return houses.size();
	}

	private void move(Position position, char c) {
		switch (c) {
		case '^' -> position.walk(NORTH);
		case 'v' -> position.walk(SOUTH);
		case '>' -> position.walk(EAST);
		case '<' -> position.walk(WEST);
		}
	}
}
