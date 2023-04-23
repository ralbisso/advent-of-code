package aoc;

import static utils.FileUtils.getAllLinesAsIntArray;

import java.util.HashSet;

import static enums.Day.DAY_;

public class Day01 extends AoC2018 {

    private final Day day = Day.DAY_01;
    private final int[] input = getAllLinesAsIntArray(day);

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
