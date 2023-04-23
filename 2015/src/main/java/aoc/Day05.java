package aoc;

import static enums.Day.DAY_05;
import static utils.FileUtils.getAllLines;

import java.util.stream.Stream;

public class Day05 extends AoC2015 {

    private final Stream<String> input = getAllLines(DAY_05).stream();

    private final String atLeast3Vowels = "^(.*[aeiou]){3}.*$";
    private final String atLeast1LetterAppearingTwiceInARow = ".*(.)\\1.*";
    private final String containsABorCDorPQorXY = ".*(ab|cd|pq|xy).*";
    private final String aPairOf2LettersWithoutOverlapping = ".*(\\w\\w).*\\1.*";
    private final String atLeast1RepeatingLetterWith1LetterInBetween = ".*(\\w)\\w\\1.*";

    public int solvePart1() {
        return (int) input.filter(this::isNiceOldRules).count();
    }

    public int solvePart2() {
        return (int) input.filter(this::isNiceNewRules).count();
    }

    private boolean isNiceOldRules(String string) {
        return string.matches(atLeast3Vowels)
                && string.matches(atLeast1LetterAppearingTwiceInARow)
                && !string.matches(containsABorCDorPQorXY);
    }

    private boolean isNiceNewRules(String string) {
        return string.matches(aPairOf2LettersWithoutOverlapping)
                && string.matches(atLeast1RepeatingLetterWith1LetterInBetween);
    }
}
