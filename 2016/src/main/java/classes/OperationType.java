package classes;

public enum OperationType {

	MOVE_POSITION,
	REVERSE_POSITIONS,
	ROTATE_BASED_ON_POSITION,
	ROTATE_LEFT,
	ROTATE_RIGHT,
	SWAP_LETTER,
	SWAP_POSITION;

	public static OperationType getOperationType(String operation) {
		OperationType type = null;
		if (operation.startsWith("move position")) {
			type = MOVE_POSITION;
		} else if (operation.startsWith("reverse positions")) {
			type = REVERSE_POSITIONS;
		} else if (operation.startsWith("rotate based on position")) {
			type = ROTATE_BASED_ON_POSITION;
		} else if (operation.startsWith("rotate left")) {
			type = ROTATE_LEFT;
		} else if (operation.startsWith("rotate right")) {
			type = ROTATE_RIGHT;
		} else if (operation.startsWith("swap letter")) {
			type = SWAP_LETTER;
		} else if (operation.startsWith("swap position")) {
			type = SWAP_POSITION;
		}
		return type;
	}
}
