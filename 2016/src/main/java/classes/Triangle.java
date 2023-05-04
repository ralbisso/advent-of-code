package classes;

import java.util.Arrays;

public class Triangle {

	private final int[] sides;

	public Triangle(int a, int b, int c) {
		sides = new int[] { a, b, c };
		Arrays.sort(sides);
	}

	public boolean isPossible() {
		return sides[0] + sides[1] > sides[2];
	}
}
