package aoc2020;

import java.util.Arrays;

import static utils.FileUtils.getAllLines;
import utils.enums.Day;

public class Day01 extends AoC2020 {

    private final Day day = Day.DAY_01;
    private final int[] input = getAllLinesAsIntArray(year, day);

    public int solvePart1() {
        Arrays.sort(input);
        for (int entry : input) {
            int difference = 2020 - entry;
            if (Arrays.binarySearch(input, difference) > 0) {
                return entry * difference;
            }
        }
        return 0;
    }

    public int solvePart2() {
        Arrays.sort(input);
        int length = input.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                int firstTwoEntries = input[i] + input[j];
                int difference = 2020 - firstTwoEntries;
                if (Arrays.binarySearch(input, difference) > 0) {
                    return input[i] * input[j] * difference;
                }
            }
        }
        return 0;
    }
}
