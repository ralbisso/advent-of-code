package aoc2017;

import static utils.FileUtils.getAllLines;
import utils.enums.Day;

public class Day01 extends AoC2017 {

    private final Day day = Day.DAY_01;
    private final char[] input = getLineAsCharArray(year, day);

    public int solvePart1() {
        int sum = 0, length = input.length;
        for (int i = 0; i < length; i++) {
            if (input[i] == input[(i + 1) % length]) {
                sum += Character.getNumericValue(input[i]);
            }
        }
        return sum;
    }

    public int solvePart2() {
        int sum = 0, length = input.length, offset = length / 2;
        for (int i = 0; i < length; i++) {
            if (input[i] == input[(i + offset) % length]) {
                sum += Character.getNumericValue(input[i]);
            }
        }
        return sum;
    }
}
