package aoc;

import static utils.FileUtils.getAllLines;

import java.util.List;

import classes.RockPaperScissors;
import static enums.Day.DAY_02;

public class Day02 extends AoC2022 {

    private final List<RockPaperScissors> input = getAllLines(DAY_02).stream()
            .map(RockPaperScissors::new).toList();

    public int solvePart1() {
        return input.stream().mapToInt(RockPaperScissors::getScorePart1).sum();
    }

    public int solvePart2() {
        return input.stream().mapToInt(RockPaperScissors::getScorePart2).sum();
    }
}
