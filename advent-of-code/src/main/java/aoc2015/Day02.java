package aoc2015;

import static utils.FileUtils.getAllLines;

import java.util.List;

import aoc2015.classes.Present;
import utils.enums.Day;

public class Day02 extends AoC2015 {

    private final Day day = Day.DAY_02;
    private final List<Present> input = getAllLines(year, day).stream().map(Present::new).toList();

    public int solvePart1() {
        return input.stream().mapToInt(Present::getWrappingPaperArea).sum();
    }

    public int solvePart2() {
        return input.stream().mapToInt(Present::getRibbonLength).sum();
    }
}
