package aoc;

import static enums.Day.DAY_03;
import static utils.FileUtils.getAllLines;

import java.util.List;

import classes.Triangle;

public class Day03 extends AoC2016 {

	private final int[][] input = getInputAsGrid(getAllLines(DAY_03));

	public int solvePart1() {
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			var triangle = new Triangle(input[i][0], input[i][1], input[i][2]);
			if (triangle.isPossible()) {
				count++;
			}
		}
		return count;
	}

	public int solvePart2() {
		int count = 0, j = 0;
		for (int i = 0; i < input.length; i += 3) {
			var triangle = new Triangle(input[i][j], input[i + 1][j], input[i + 2][j]);
			if (triangle.isPossible()) {
				count++;
			}
			if (i == input.length - 3) {
				i = 0;
				if (++j > 2) {
					break;
				}
			}
		}
		return count;
	}

	private int[][] getInputAsGrid(List<String> input) {
		int[][] grid = new int[input.size()][3];
		for (int i = 0; i < grid.length; i++) {
			String[] split = input.get(i).trim().split(" +");
			grid[i] = new int[] { Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]) };
		}
		return grid;
	}
}
