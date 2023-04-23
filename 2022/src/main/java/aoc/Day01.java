package aoc;

import static utils.FileUtils.getAllLines;

import java.util.Arrays;
import java.util.List;

import static enums.Day.DAY_;

public class Day01 extends AoC2022 {

    private final Day day = Day.DAY_01;
    private final List<String> input = getAllLines(day);

    public int solvePart1() {
        int max = 0, elf = 0;
        for (String snack : input) {
            if (snack.isEmpty()) {
                if (elf > max) {
                    max = elf;
                }
                elf = 0;
            } else {
                elf += Integer.parseInt(snack);
            }
        }
        return max;
    }

    public int solvePart2() {
        int[] max = { 0, 0, 0 };
        int elf = 0;
        for (String snack : input) {
            if (snack.isEmpty()) {
                if (elf > max[0]) {
                    max[0] = elf;
                    Arrays.sort(max);
                }
                elf = 0;
            } else {
                elf += Integer.parseInt(snack);
            }
        }
        return max[0] + max[1] + max[2];
    }
}
