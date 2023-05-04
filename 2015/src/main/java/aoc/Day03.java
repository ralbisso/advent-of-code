package aoc;

import static enums.Day.DAY_03;
import static utils.FileUtils.getLineAsCharArray;

import java.util.HashSet;
import java.util.Set;

import classes.Position;
import enums.Direction;

public class Day03 extends AoC2015 {

	private final char[] input = getLineAsCharArray(DAY_03);

	private final static char NORTH = '^';
	private final static char SOUTH = 'v';
	private final static char EAST = '>';
	private final static char WEST = '<';

	public int solvePart1() {
		Set<Position> houses = new HashSet<>();
		var santasPosition = new Position(0, 0);
		houses.add(santasPosition);
		for (char c : input) {
			moveAndAddToHouses(santasPosition, c, houses);
		}
		return houses.size();
	}

	public int solvePart2() {
		Set<Position> houses = new HashSet<>();
		var santasPosition = new Position(0, 0);
		var robotPosition = new Position(0, 0);
		houses.add(santasPosition);
		for (int i = 0; i < input.length; i += 2) {
			moveAndAddToHouses(santasPosition, input[i], houses);
			moveAndAddToHouses(robotPosition, input[i + 1], houses);
		}
		return houses.size();
	}

	private void moveAndAddToHouses(Position position, char c, Set<Position> houses) {
		move(position, c);
		houses.add(position.copyPosition());
	}

	private void move(Position position, char c) {
		switch (c) {
		case NORTH -> position.walk(Direction.NORTH);
		case SOUTH -> position.walk(Direction.SOUTH);
		case EAST -> position.walk(Direction.EAST);
		case WEST -> position.walk(Direction.WEST);
		}
	}
}
