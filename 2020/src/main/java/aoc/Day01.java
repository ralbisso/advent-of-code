package aoc;

import static enums.Day.DAY_01;
import static utils.FileUtils.getAllLinesAsIntArray;

import java.util.Arrays;

public class Day01 extends AoC2020 {

    private final int[] input = getAllLinesAsIntArray(DAY_01);

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
