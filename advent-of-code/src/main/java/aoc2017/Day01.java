package aoc2017;

import utils.FileUtils;
import utils.enums.Day;

public class Day01 extends AoC2017 {

    private final Day day = Day.DAY_01;
    private final String input = FileUtils.getLine(year, day);

    public int solvePart1() {
        int sum = 0;
        char[] captcha = input.toCharArray();
        for (int i = 0; i < captcha.length; i++) {
            if (captcha[i] == captcha[(i + 1) % captcha.length]) {
                sum += Character.getNumericValue(captcha[i]);
            }
        }
        return sum;
    }

    public int solvePart2() {
        char[] captcha = input.toCharArray();
        int sum = 0, offset = captcha.length / 2;
        for (int i = 0; i < captcha.length; i++) {
            if (captcha[i] == captcha[(i + offset) % captcha.length]) {
                sum += Character.getNumericValue(captcha[i]);
            }
        }
        return sum;
    }
}
