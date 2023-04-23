package aoc;

import static enums.Day.DAY_01;
import static utils.FileUtils.getAllLinesAsIntArray;

import java.util.HashSet;

public class Day01 extends AoC2018 {

    private final int[] input = getAllLinesAsIntArray(DAY_01);

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
