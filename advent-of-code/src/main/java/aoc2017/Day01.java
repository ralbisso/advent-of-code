package aoc2017;

import utils.FileUtils;
import utils.enums.Day;

public class Day01 extends AoC2017 {

    private final Day day = Day.DAY_01;
    private final String input = FileUtils.getLine(year, day);

    public int solvePart1() {
        char[] captcha = input.toCharArray();
        int sum = 0, length = captcha.length;
        for (int i = 0; i < length; i++) {
            if (captcha[i] == captcha[(i + 1) % length]) {
                sum += Character.getNumericValue(captcha[i]);
            }
        }
        return sum;
    }

    public int solvePart2() {
        char[] captcha = input.toCharArray();
        int sum = 0, length = captcha.length, offset = length / 2;
        for (int i = 0; i < length; i++) {
            if (captcha[i] == captcha[(i + offset) % length]) {
                sum += Character.getNumericValue(captcha[i]);
            }
        }
        return sum;
    }
}
