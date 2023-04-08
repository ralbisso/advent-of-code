package aoc2022;

import java.util.List;

import aoc2022.classes.AssignmentPair;
import static utils.FileUtils.getAllLines;
import utils.enums.Day;

public class Day04 extends AoC2022 {

    private final Day day = Day.DAY_04;
    private final List<String> input = getAllLines(year, day);

    public int solvePart1() {
        return (int) input.stream()
                .map(AssignmentPair::new)
                .filter(AssignmentPair::hasFullyContainedAssignment)
                .count();
    }

    public int solvePart2() {
        return (int) input.stream()
                .map(AssignmentPair::new)
                .filter(AssignmentPair::hasOverlappingAssignment)
                .count();
    }
}
