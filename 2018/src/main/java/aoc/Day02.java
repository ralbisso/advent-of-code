package aoc;

import static enums.Day.DAY_02;
import static utils.FileUtils.getAllLines;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day02 extends AoC2018 {

	private final List<String> input = getAllLines(DAY_02);

	public int solvePart1() {
		int exactlyTwoOfAnyLetter = 0, exactlyThreeOfAnyLetter = 0;
		for (String boxID : input) {
			boolean hasExactlyTwoOfAnyLetter = false;
			boolean hasExactlyThreeOfAnyLetter = false;
			for (var e : getLetterCounts(boxID).entrySet()) {
				if (e.getValue() == 2) {
					hasExactlyTwoOfAnyLetter = true;
				} else if (e.getValue() == 3) {
					hasExactlyThreeOfAnyLetter = true;
				}
			}
			if (hasExactlyTwoOfAnyLetter) {
				exactlyTwoOfAnyLetter++;
			}
			if (hasExactlyThreeOfAnyLetter) {
				exactlyThreeOfAnyLetter++;
			}
		}
		return exactlyTwoOfAnyLetter * exactlyThreeOfAnyLetter;
	}

	public String solvePart2() {
		int size = input.size();
		for (int i = 0; i < size; i++) {
			String boxID1 = input.get(i);
			for (int j = i + 1; j < size; j++) {
				String boxID2 = input.get(j);
				String commonLetters = getCommonLetters(boxID1, boxID2);
				if (boxID1.length() == commonLetters.length() + 1) {
					return commonLetters;
				}
			}
		}
		return null;
	}

	private Map<Character, Integer> getLetterCounts(String boxID) {
		Map<Character, Integer> letterCounts = new HashMap<>();
		for (char c : boxID.toCharArray()) {
			letterCounts.putIfAbsent(c, 0);
			letterCounts.put(c, letterCounts.get(c) + 1);
		}
		return letterCounts;
	}

	private String getCommonLetters(String boxID1, String boxID2) {
		String commonLetters = "";
		for (int i = 0; i < boxID1.length(); i++) {
			if (boxID1.charAt(i) == boxID2.charAt(i)) {
				commonLetters += boxID1.charAt(i);
			}
		}
		return commonLetters;
	}
}
