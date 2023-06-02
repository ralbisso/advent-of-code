package aoc;

import static enums.Day.DAY_20;
import static utils.FileUtils.getLineAsInt;

public class Day20 extends AoC2015 {

	private final int input = getLineAsInt(DAY_20);

	public int solvePart1() {
		int[] houses = new int[780000];
		int length = houses.length;
		for (int elf = 1; elf < length; elf++) {
			int presents = elf * 10;
			for (int i = elf; i < length; i += elf) {
				houses[i] += presents;
				if (houses[i] > input) {
					return i;
				}
			}
		}
		return 0;
	}

	public int solvePart2() {
		int[] houses = new int[790000];
		int length = houses.length;
		for (int elf = 1; elf < length; elf++) {
			int presents = elf * 11, count = 50;
			for (int i = elf; i < length; i += elf) {
				houses[i] += presents;
				if (houses[i] > input) {
					return i;
				}
				if (--count == 0) {
					break;
				}
			}
		}
		return 0;
	}
}
