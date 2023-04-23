package aoc;

import static utils.FileUtils.getAllLinesAsIntArray;

import static enums.Day.DAY_01;

public class Day01 extends AoC2021 {

    private final Day day = Day.DAY_01;
    private final int[] input = getAllLinesAsIntArray(day);

    public int solvePart1() {
        int count = 0;
        for (int i = 1; i < input.length; i++) {
            if (input[i] > input[i - 1]) {
                count++;
            }
        }
        return count;
    }

    public int solvePart2() {
        int count = 0, sum = input[0] + input[1] + input[2];
        for (int i = 3; i < input.length; i++) {
            int next = sum - input[i - 3] + input[i];
            if (next > sum) {
                count++;
            }
        }
        return count;
    }
}
