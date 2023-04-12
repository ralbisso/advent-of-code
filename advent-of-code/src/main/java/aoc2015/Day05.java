package aoc2015;

import static utils.FileUtils.getAllLines;

import java.util.List;

import utils.enums.Day;

public class Day05 extends AoC2015 {

    private final Day day = Day.DAY_05;
    private final List<String> input = getAllLines(year, day);
    
    private final String atLeast3Vowels = "^(.*[aeiou]){3}.*$";
    private final String atLeast1LetterAppearingTwiceInARow = ".*(.)\\1.*";
    private final String containsABorCDorPQorXY = ".*(ab|cd|pq|xy).*";    
    private final String aPairOf2LettersWithoutOverlapping = ".*(\\w\\w).*\\1.*";
    private final String atLeast1RepeatingLetterWith1LetterInBetween = ".*(\\w)\\w\\1.*";

    public int solvePart1() {
        return (int) input.stream().filter(this::isNiceOldRules).count();
    }

    public int solvePart2() {
        return (int) input.stream().filter(this::isNiceNewRules).count();
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
