package aoc2019;

import utils.FileUtils;
import utils.enums.Day;

public class Day01 extends AoC2019 {

    private final Day day = Day.DAY_01;
    private final int[] input = FileUtils.getAllLinesAsIntArray(year, day);

    public int solvePart1() {
        int fuel = 0;
        for (int mass : input) {
            fuel += mass / 3 - 2;
        }
        return fuel;
    }

    public int solvePart2() {
        int fuel = 0;
        for (int mass : input) {
            while (mass > 0) {
                mass = mass / 3 - 2;
                fuel += mass > 0 ? mass : 0;
            }
        }
        return fuel;
    }
}
