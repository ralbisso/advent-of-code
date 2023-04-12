package aoc2015;

import static utils.FileUtils.getLineAsCharArray;

import java.util.HashSet;
import java.util.Set;

import classes.Position;
import utils.enums.Day;

public class Day03 extends AoC2015 {

    private final Day day = Day.DAY_03;
    private final char[] input = getLineAsCharArray(year, day);

    public int solvePart1() {
        Set<Position> houses = new HashSet<>();
        Position santasPosition = new Position(0, 0);
        houses.add(santasPosition);
        for (char c : input) {
            move(santasPosition, c);
            houses.add(santasPosition.getNewPosition());
        }
        return houses.size();
    }

    public int solvePart2() {
        Set<Position> houses = new HashSet<>();
        Position santasPosition = new Position(0, 0);
        Position robotPosition = new Position(0, 0);
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
        case '^' -> position.moveNorth();
        case 'v' -> position.moveSouth();
        case '>' -> position.moveEast();
        case '<' -> position.moveWest();
        }
    }
}
