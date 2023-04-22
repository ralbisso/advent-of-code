package aoc2015;

import static utils.FileUtils.getLine;

import org.apache.commons.codec.digest.DigestUtils;

import utils.enums.Day;

public class Day04 extends AoC2015 {

    private final Day day = Day.DAY_04;
    private final String input = getLine(year, day);

    public int solvePart1() {
        int answer = 0;
        while (!DigestUtils.md5Hex(input + ++answer).startsWith("00000"));
        return answer;
    }

    public int solvePart2() {
        int answer = 0;
        while (!DigestUtils.md5Hex(input + ++answer).startsWith("000000"));
        return answer;
    }
}
