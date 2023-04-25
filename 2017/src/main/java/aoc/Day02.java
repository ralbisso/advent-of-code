package aoc;

import static enums.Day.DAY_02;
import static utils.FileUtils.getAllLines;

import java.util.Arrays;
import java.util.List;

public class Day02 extends AoC2017 {

	private final List<String> input = getAllLines(DAY_02);

	public int solvePart1() {
		int checksum = 0;
		for (String line : input) {
			int[] numbers = getSortedNumbers(line);
			checksum += numbers[numbers.length - 1] - numbers[0];
		}
		return checksum;
	}

	public int solvePart2() {
		int checksum = 0;
		for (String line : input) {
			int[] numbers = getSortedNumbers(line);
			int length = numbers.length;
			for (int i = 0; i < length; i++) {
				for (int j = i + 1; j < length; j++) {
					if (numbers[j] % numbers[i] == 0) {
						checksum += numbers[j] / numbers[i];
					}
				}
			}
		}
		return checksum;
	}

	private int[] getSortedNumbers(String line) {
		String[] split = line.split("\t");
		int[] numbers = new int[split.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(split[i]);
		}
		Arrays.sort(numbers);
		return numbers;
	}
}
