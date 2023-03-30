package aoc2015;

import utils.FileUtils;
import utils.enums.Day;

public class Day01 extends AoC2015 {

    private final Day day = Day.DAY_01;
    private final String input = FileUtils.getLine(year, day);

    public int solvePart1() {
        int floor = 0;
        for (char c : input.toCharArray()) {
            floor += (c == '(') ? 1 : -1;
        }
        return floor;
    }

    public int solvePart2() {
        int floor = 0, position = 1;
        for (char c : input.toCharArray()) {
            floor += (c == '(') ? 1 : -1;
            if (floor == -1) {
                break;
            }
            position++;
        }
        return position;
    }
}