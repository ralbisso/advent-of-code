package aoc;

import static enums.Day.DAY_01;
import static utils.FileUtils.getAllLinesAsIntArray;

public class Day01 extends AoC2019 {

    private final int[] input = getAllLinesAsIntArray(DAY_01);

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
