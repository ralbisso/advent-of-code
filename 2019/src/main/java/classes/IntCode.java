package classes;

public class IntCode {

	private int[] prog;

	private final static int OPCODE_ADD = 1;
	private final static int OPCODE_MUL = 2;
	private final static int OPCODE_END = 99;

	public IntCode(int[] program) {
		prog = program;
	}

	public void run() {
		int i = 0;
		while (prog[i] != OPCODE_END) {
			if (prog[i] == OPCODE_ADD) {
				prog[prog[i + 3]] = prog[prog[i + 1]] + prog[prog[i + 2]];
			} else if (prog[i] == OPCODE_MUL) {
				prog[prog[i + 3]] = prog[prog[i + 1]] * prog[prog[i + 2]];
			}
			i += 4;
		}
	}
}
