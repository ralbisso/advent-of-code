package classes;

import java.util.List;

public class Operation {

	public OperationType type;
	private Character x;
	private Character y;

	public Operation(String operation) {
		this.type = OperationType.getOperationType(operation);
		for (String split : operation.split(" ")) {
			if (split.length() == 1) {
				if (x == null) {
					x = split.charAt(0);
				} else {
					y = split.charAt(0);
				}
			}
		}
	}

	public void apply(List<Character> password) {
		switch (type) {
		case MOVE_POSITION -> movePosition(password, this.x, this.y);
		case REVERSE_POSITIONS -> reversePositions(password);
		case ROTATE_BASED_ON_POSITION -> rotateBasedOnPosition(password);
		case ROTATE_LEFT -> rotateLeft(password);
		case ROTATE_RIGHT -> rotateRight(password);
		case SWAP_LETTER -> swapLetter(password);
		case SWAP_POSITION -> swapPosition(password);
		}
	}

	public void unapply(List<Character> password) {
		switch (type) {
		case MOVE_POSITION -> movePosition(password, this.y, this.x);
		case REVERSE_POSITIONS -> reversePositions(password);
		case ROTATE_BASED_ON_POSITION -> unrotateBasedOnPosition(password);
		case ROTATE_LEFT -> rotateRight(password);
		case ROTATE_RIGHT -> rotateLeft(password);
		case SWAP_LETTER -> swapLetter(password);
		case SWAP_POSITION -> swapPosition(password);
		}
	}

	private void movePosition(List<Character> password, char x, char y) {
		int xValue = Character.getNumericValue(x);
		int yValue = Character.getNumericValue(y);
		password.add(yValue, password.remove(xValue));
	}

	private void reversePositions(List<Character> password) {
		int x = Character.getNumericValue(this.x);
		int y = Character.getNumericValue(this.y);
		int size = (y - x) / 2;
		for (int i = 0; i <= size; i++) {
			swapPosition(password, x + i, y - i);
		}
	}

	private void rotateBasedOnPosition(List<Character> password) {
		int index = password.indexOf(x);
		rotateRight(password, index + (index >= 4 ? 2 : 1));
	}

	private void unrotateBasedOnPosition(List<Character> password) {
		int index = password.indexOf(x);
		int origin = index == 0 ? 7 : (index + (index % 2 == 0 ? 6 : -1)) / 2;
		rotateLeft(password, origin + (origin >= 4 ? 2 : 1));
	}

	private void rotateLeft(List<Character> password) {
		int x = Character.getNumericValue(this.x);
		rotateLeft(password, x);
	}

	private void rotateLeft(List<Character> password, int x) {
		for (int i = 0; i < x; i++) {
			password.add(password.remove(0));
		}
	}

	private void rotateRight(List<Character> password) {
		int x = Character.getNumericValue(this.x);
		rotateRight(password, x);
	}

	private void rotateRight(List<Character> password, int x) {
		int last = password.size() - 1;
		for (int i = 0; i < x; i++) {
			password.add(0, password.remove(last));
		}
	}

	private void swapLetter(List<Character> password) {
		int indexX = password.indexOf(x), indexY = password.indexOf(y);
		password.set(indexX, y);
		password.set(indexY, x);
	}

	private void swapPosition(List<Character> password) {
		int x = Character.getNumericValue(this.x);
		int y = Character.getNumericValue(this.y);
		swapPosition(password, x, y);
	}

	private void swapPosition(List<Character> password, int x, int y) {
		password.set(y, password.set(x, password.get(y)));
	}
}
