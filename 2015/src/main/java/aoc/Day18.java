package aoc;

import static enums.Day.DAY_18;
import static utils.FileUtils.getAllLinesAsCharMatrix;

import java.util.function.Consumer;

import classes.Conway;

public class Day18 extends AoC2015 {

	private final char[][] input = getAllLinesAsCharMatrix(DAY_18);

	private final static int STEPS = 100;
	private final static char LIGHT_ON = '#';
	private final static char LIGHT_OFF = '.';

	public int solvePart1() {
		Conway grid = new Conway(input, LIGHT_ON, LIGHT_OFF);
		grid.addSteps(STEPS);
		return grid.getAliveCells();
	}

	public int solvePart2() {
		Consumer<char[][]> afterStep = (char[][] grid) -> turnOnCorners(grid);
		Conway grid = new Conway(input, LIGHT_ON, LIGHT_OFF, afterStep);
		grid.addSteps(STEPS);
		return grid.getAliveCells();
	}

	private void turnOnCorners(char[][] grid) {
		for (int i = 0; i < grid.length; i += grid.length - 1) {
			for (int j = 0; j < grid[i].length; j += grid[i].length - 1) {
				grid[i][j] = LIGHT_ON;
			}
		}
	}
}
