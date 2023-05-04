package classes;

import java.util.function.Consumer;

public class Conway {

	private char[][] grid;
	private final char aliveSymbol;
	private final char deadSymbol;
	private Consumer<char[][]> afterStep;

	public Conway(char[][] grid, char aliveSymbol, char deadSymbol) {
		this.grid = grid;
		this.aliveSymbol = aliveSymbol;
		this.deadSymbol = deadSymbol;
	}

	public Conway(char[][] grid, char aliveSymbol, char deadSymbol, Consumer<char[][]> afterStep) {
		this(grid, aliveSymbol, deadSymbol);
		this.afterStep = afterStep;
	}

	public void addSteps(int steps) {
		for (int i = 0; i < steps; i++) {
			addStep();
		}
	}

	private void addStep() {
		char[][] copy = new char[grid.length][];
		for (int i = 0; i < copy.length; i++) {
			char[] row = new char[grid[i].length];
			for (int j = 0; j < row.length; j++) {
				int aliveNeighboursCount = getAliveNeighboursCount(i, j);
				if (isAlive(i, j) && (aliveNeighboursCount < 2 || aliveNeighboursCount > 3)) {
					row[j] = deadSymbol;
				} else if (isDead(i, j) && aliveNeighboursCount == 3) {
					row[j] = aliveSymbol;
				} else {
					row[j] = grid[i][j];
				}
			}
			copy[i] = row;
		}
		if (afterStep != null) {
			afterStep.accept(copy);
		}
		this.grid = copy;
	}

	private int getAliveNeighboursCount(int x, int y) {
		int count = 0;
		for (int i = Math.max(0, x - 1); i <= Math.min(grid.length - 1, x + 1); i++) {
			for (int j = Math.max(0, y - 1); j <= Math.min(grid[i].length - 1, y + 1); j++) {
				if ((i != x || j != y) && isAlive(i, j)) {
					count++;
				}
			}
		}
		return count;
	}

	public int getAliveCells() {
		int count = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (isAlive(i, j)) {
					count++;
				}
			}
		}
		return count;
	}

	private boolean isAlive(int i, int j) {
		return grid[i][j] == aliveSymbol;
	}

	private boolean isDead(int i, int j) {
		return grid[i][j] == deadSymbol;
	}
}
