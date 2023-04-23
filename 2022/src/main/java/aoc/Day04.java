package aoc;

import static enums.Day.DAY_04;
import static utils.FileUtils.getAllLines;

import java.util.List;

import classes.AssignmentPair;

public class Day04 extends AoC2022 {

    private final List<AssignmentPair> input = getAllLines(DAY_04).stream()
            .map(AssignmentPair::new).toList();

    public int solvePart1() {
        return (int) input.stream().filter(AssignmentPair::hasFullyContainedAssignment).count();
    }

    public int solvePart2() {
        return (int) input.stream().filter(AssignmentPair::hasOverlappingAssignment).count();
    }
}
