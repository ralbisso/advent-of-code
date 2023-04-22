package aoc;

import static utils.FileUtils.getAllLines;

import java.util.List;

import aoc2022.classes.RockPaperScissors;
import enums.Day;

public class Day02 extends AoC2022 {

    private final Day day = Day.DAY_02;
    private final List<RockPaperScissors> input = getAllLines(year, day).stream()
            .map(RockPaperScissors::new).toList();

    public int solvePart1() {
        return input.stream().mapToInt(RockPaperScissors::getScorePart1).sum();
    }

    public int solvePart2() {
        return input.stream().mapToInt(RockPaperScissors::getScorePart2).sum();
    }
}