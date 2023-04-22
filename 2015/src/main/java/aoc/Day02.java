package aoc;

import static utils.FileUtils.getAllLines;

import java.util.stream.Stream;

import classes.Present;
import enums.Day;

public class Day02 extends AoC2015 {

    private final Day day = Day.DAY_02;
    private final Stream<Present> input = getAllLines(year, day).stream().map(Present::new);

    public int solvePart1() {
        return input.mapToInt(Present::getWrappingPaperArea).sum();
    }

    public int solvePart2() {
        return input.mapToInt(Present::getRibbonLength).sum();
    }
}
