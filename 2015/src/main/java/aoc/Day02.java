package aoc;

import static enums.Day.DAY_02;
import static utils.FileUtils.getAllLines;

import java.util.stream.Stream;

import classes.Present;

public class Day02 extends AoC2015 {

	private final Stream<Present> input = getAllLines(DAY_02).stream().map(Present::new);

    public int solvePart1() {
        return input.mapToInt(Present::getWrappingPaperArea).sum();
    }

    public int solvePart2() {
        return input.mapToInt(Present::getRibbonLength).sum();
    }
}
