package aoc2015;

import static utils.FileUtils.getAllLines;

import java.util.List;

import aoc2015.classes.Action;
import utils.enums.Day;

public class Day06 extends AoC2015 {

    private final Day day = Day.DAY_06;
    private final List<String> input = getAllLines(year, day);

    private final static int SIZE = 1000;
    private final static String TURN_ON = "turn on";
    private final static String TURN_OFF = "turn off";
    private final static String TOGGLE = "toggle";

    public int solvePart1() {
        var grid = new boolean[SIZE][SIZE];
        for (String instruction : input) {
            followInstruction(grid, new Action(instruction));
        }
        return getLightsCount(grid);
    }

    public int solvePart2() {
        var grid = new int[SIZE][SIZE];
        for (String instruction : input) {
            followInstruction(grid, new Action(instruction));
        }
        return getTotalBrightness(grid);
    }

    private void followInstruction(boolean[][] grid, Action instruction) {
        String action = instruction.getAction();
        int[] begin = instruction.getBegin(), end = instruction.getEnd();
        for (int i = begin[0]; i <= end[0]; i++) {
            for (int j = begin[1]; j <= end[1]; j++) {
                switch (action) {
                case TURN_ON -> grid[i][j] = true;
                case TURN_OFF -> grid[i][j] = false;
                case TOGGLE -> grid[i][j] = !grid[i][j];
                }
            }
        }
    }

    private void followInstruction(int[][] grid, Action instruction) {
        String action = instruction.getAction();
        int[] begin = instruction.getBegin(), end = instruction.getEnd();
        for (int i = begin[0]; i <= end[0]; i++) {
            for (int j = begin[1]; j <= end[1]; j++) {
                switch (action) {
                case TURN_ON -> grid[i][j]++;
                case TURN_OFF -> grid[i][j] = Math.max(grid[i][j] - 1, 0);
                case TOGGLE -> grid[i][j] += 2;
                }
            }
        }
    }

    private int getLightsCount(boolean[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }

    private int getTotalBrightness(int[][] grid) {
        int brightness = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                brightness += grid[i][j];
            }
        }
        return brightness;
    }
}
