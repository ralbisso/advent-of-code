package aoc2016;

import static utils.FileUtils.getLine;

import utils.enums.Day;
import utils.enums.Direction;

public class Day01 extends AoC2016 {

    private final Day day = Day.DAY_01;
    private final String[] input = getLine(year, day).split(", ");

    public int solvePart1() {
        int facing = 0; // Direction index: NORTH
        int[] position = { 0, 0 };
        for (String instruction : input) {
            facing = move(facing, position, instruction);
        }
        return getManhattanDistance(position);
    }

    public int solvePart2() {
        int facing = 0; // Direction index: NORTH
        int[] position = { 0, 0 };
        for (String instruction : input) {
            facing = move(facing, position, instruction);
        }
        return getManhattanDistance(position);
    }

    private int move(int facing, int[] position, String instruction) {
        facing = turn(facing, instruction.charAt(0));
        var direction = Direction.values()[facing];
        int steps = Integer.parseInt(instruction.substring(1));
        walk(position, direction, steps);
        return facing;
    }

    private int turn(int facing, char instruction) {
        if ('R' == instruction) {
            facing = (facing + 1) % 4;
        } else {
            facing = ((facing - 1) + 4) % 4;
        }
        return facing;
    }

    private void walk(int[] position, Direction direction, int steps) {
        switch (direction) {
        case NORTH -> position[0] += steps;
        case EAST -> position[1] += steps;
        case SOUTH -> position[0] -= steps;
        case WEST -> position[1] -= steps;
        }
    }

    private int getManhattanDistance(int[] position) {
        return Math.abs(position[0]) + Math.abs(position[1]);
    }
}
