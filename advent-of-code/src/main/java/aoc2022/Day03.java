package aoc2022;

import java.util.List;

import static utils.FileUtils.getAllLines;
import utils.enums.Day;

public class Day03 extends AoC2022 {

    private final Day day = Day.DAY_03;
    private final List<String> input = getAllLines(year, day);

    private final static String LOWERCASE_ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private final static String UPPERCASE_ALPHABET = LOWERCASE_ALPHABET.toUpperCase();
    private final static String ALPHABET = LOWERCASE_ALPHABET + UPPERCASE_ALPHABET;

    public int solvePart1() {
        int sum = 0;
        for (String rucksack : input) {
            String compartment1 = rucksack.substring(0, rucksack.length() / 2);
            String compartment2 = rucksack.substring(rucksack.length() / 2);
            var compartments = List.of(compartment1, compartment2);
            sum += getSharedItemType(compartments);
        }
        return sum;
    }

    public int solvePart2() {
        int sum = 0;
        for (int i = 0; i < input.size(); i += 3) {
            String rucksack1 = input.get(i);
            String rucksack2 = input.get(i + 1);
            String rucksack3 = input.get(i + 2);
            var group = List.of(rucksack1, rucksack2, rucksack3);
            sum += getSharedItemType(group);
        }
        return sum;
    }

    private int getSharedItemType(List<String> rucksacks) {
        for (char c : ALPHABET.toCharArray()) {
            boolean isSharedItem = true;
            for (String rucksack : rucksacks) {
                if (rucksack.indexOf(c) < 0) {
                    isSharedItem = false;
                    break;
                }
            }
            if (isSharedItem) {
                return ALPHABET.indexOf(c) + 1;
            }
        }
        return 0;
    }
}
