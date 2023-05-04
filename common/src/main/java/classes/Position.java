package classes;

import java.util.Objects;

import enums.Direction;

public class Position {

	private int x;
	private int y;
	private Direction facing = Direction.NORTH;

	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void turnAndWalk(String instruction) {
		turn(instruction.charAt(0));
		walk(Integer.parseInt(instruction.substring(1)));
	}

	public void turn(char direction) {
		if ('L' == direction) {
			turnLeft();
		} else {
			turnRight();
		}
	}

	private void turnLeft() {
		facing = switch (facing) {
		case NORTH -> Direction.EAST;
		case EAST -> Direction.SOUTH;
		case SOUTH -> Direction.WEST;
		case WEST -> Direction.NORTH;
		};
	}

	private void turnRight() {
		facing = switch (facing) {
		case NORTH -> Direction.WEST;
		case EAST -> Direction.NORTH;
		case SOUTH -> Direction.EAST;
		case WEST -> Direction.SOUTH;
		};
	}

	public void walk(int steps) {
		switch (facing) {
		case EAST -> walkEast(steps);
		case NORTH -> walkNorth(steps);
		case SOUTH -> walkSouth(steps);
		case WEST -> walkWest(steps);
		}
	}

	public void walk(Direction direction) {
		switch (direction) {
		case EAST -> walkEast(1);
		case NORTH -> walkNorth(1);
		case SOUTH -> walkSouth(1);
		case WEST -> walkWest(1);
		}
	}

	private void walkEast(int steps) {
		x += steps;
	}

	private void walkNorth(int steps) {
		y += steps;
	}

	private void walkSouth(int steps) {
		y -= steps;
	}

	private void walkWest(int steps) {
		x -= steps;
	}

	public Position copyPosition() {
		return new Position(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		Position other = (Position) obj;
		return this.x == other.x && this.y == other.y;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.x, this.y);
	}
}
