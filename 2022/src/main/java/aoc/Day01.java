package aoc;

import static enums.Day.DAY_01;
import static utils.FileUtils.getAllLines;

import java.util.Arrays;
import java.util.List;

public class Day01 extends AoC2022 {

    private final List<String> input = getAllLines(DAY_01);

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
