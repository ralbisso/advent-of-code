package aoc;

import static enums.Day.DAY_01;
import static utils.FileUtils.getLineAsCharArray;

public class Day01 extends AoC2017 {

    private final char[] input = getLineAsCharArray(DAY_01);

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
