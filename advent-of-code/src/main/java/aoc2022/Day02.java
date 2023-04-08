package aoc2022;

import java.util.List;

import aoc2022.classes.RockPaperScissors;
import static utils.FileUtils.getAllLines;
import utils.enums.Day;

public class Day02 extends AoC2022 {

    private final Day day = Day.DAY_02;
    private final List<String> input = getAllLines(year, day);

    public int solvePart1() {
        return input.stream()
                .map(RockPaperScissors::new)
                .mapToInt(RockPaperScissors::getScorePart1)
                .sum();
    }

    public int solvePart2() {
        return input.stream()
                .map(RockPaperScissors::new)
                .mapToInt(RockPaperScissors::getScorePart2)
                .sum();
    }
}
