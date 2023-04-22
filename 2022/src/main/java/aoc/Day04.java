package aoc;

import static utils.FileUtils.getAllLines;

import java.util.List;

import classes.AssignmentPair;
import enums.Day;

public class Day04 extends AoC2022 {

    private final Day day = Day.DAY_04;
    private final List<AssignmentPair> input = getAllLines(year, day).stream()
            .map(AssignmentPair::new).toList();

    public int solvePart1() {
        return (int) input.stream().filter(AssignmentPair::hasFullyContainedAssignment).count();
    }

    public int solvePart2() {
        return (int) input.stream().filter(AssignmentPair::hasOverlappingAssignment).count();
    }
}
