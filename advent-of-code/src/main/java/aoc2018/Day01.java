package aoc2018;

import java.util.HashSet;

import static utils.FileUtils.getAllLines;
import utils.enums.Day;

public class Day01 extends AoC2018 {

    private final Day day = Day.DAY_01;
    private final int[] input = getAllLinesAsIntArray(year, day);

    public int solvePart1() {
        int frequency = 0;
        for (int change : input) {
            frequency += change;
        }
        return frequency;
    }

    public int solvePart2() {
        int frequency = 0, index = 0;
        var history = new HashSet<>();
        while (history.add(frequency)) {
            frequency += input[index];
            index = (index + 1) % input.length;
        }
        return frequency;
    }
}
