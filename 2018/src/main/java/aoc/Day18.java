package aoc;

import static enums.Day.DAY_18;
import static utils.FileUtils.getAllLinesAsCharMatrix;

public class Day18 extends AoC2018 {

    private final char[][] input = getAllLinesAsCharMatrix(DAY_18);

    private static final char OPEN_GROUND = '.';
    private static final char TREES = '|';
    private static final char LUMBERYARD = '#';
    
    public int solvePart1() {
        return getResourceValueAfterNYears(input, 10);
    }


    public int solvePart2() {
        //return getResourceValueAfterNYears(input, 1000000000);
        return getResourceValueAfterNYears(input, 1000);
    }
    

	private int getResourceValueAfterNYears(char[][] area, int years) {
		int year = 0, size = area.length;
    	while (year < years) {
    		char[][] nextArea = new char[size][size];
            for (int i = 0; i < area.length; i++) {
                for (int j = 0; j < area[i].length; j++) {
                	int[] adjacentAcres = getAdjacentAcres(area, i, j);
                	if (OPEN_GROUND == area[i][j] && adjacentAcres[1] >= 3) {
                		nextArea[i][j] = TREES;
                	} else if (TREES == area[i][j] && adjacentAcres[2] >= 3) {
                		nextArea[i][j] = LUMBERYARD;
                	} else if (LUMBERYARD == area[i][j]  && (adjacentAcres[1] < 1 || adjacentAcres[2] < 1)) {
                		nextArea[i][j] = OPEN_GROUND;
                	} else {
                		nextArea[i][j] = area[i][j];
                	}
                }
            }
            area = nextArea;
        	year++;
        	for (int i = 0; i < size; i++) {
            	for (int j = 0; j < size; j++) {
            		System.out.print(area[i][j]);
            	}
            	System.out.println();
        	}
        	System.out.println();
    	}
    	return getResourceValue(area);
	}
    
    private int[] getAdjacentAcres(char[][] area, int x, int y) {
    	int[] adjacentAcres = new int[3];
    	for (int i = Math.max(0, x - 1); i <= Math.min(x + 1, area.length - 1); i++) {
        	for (int j = Math.max(0, y - 1); j <= Math.min(y + 1, area[i].length - 1); j++) {
        		if (i == x && j == y) {
        			continue;
        		}
        		switch(area[i][j]) {
        		case OPEN_GROUND -> adjacentAcres[0]++;
        		case TREES -> adjacentAcres[1]++;
        		case LUMBERYARD -> adjacentAcres[2]++;
        		}
        	}
    	}
    	return adjacentAcres;
    }
    
    private int getResourceValue(char[][] area) {
    	int woodedAcres = 0, lumberyards = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
            	if (TREES == area[i][j]) {
            		woodedAcres++;
            	} else if (LUMBERYARD == area[i][j]) {
            		lumberyards++;
            	}
            }
        }
    	return woodedAcres * lumberyards;
    }
}
