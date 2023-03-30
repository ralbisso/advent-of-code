package aoc2018;

import java.util.HashSet;
import java.util.List;

import utils.FileUtils;
import utils.enums.Day;

public class Day01 extends AoC2018 {

    private final Day day = Day.DAY_01;
    private final List<String> input = FileUtils.getAllLines(year, day);

    public int solvePart1() {
        int frequency = 0;
        for (String change : input) {
            frequency += Integer.parseInt(change);
        }
        return frequency;
    }

    public int solvePart2() {
        int frequency = 0, index = 0;
        var history = new HashSet<>();
        while (history.add(frequency)) {
            frequency += Integer.parseInt(input.get(index));
            index = (index + 1) % input.size();
        }
        return frequency;
    }
}
