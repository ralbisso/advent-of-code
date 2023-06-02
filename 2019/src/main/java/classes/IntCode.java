package classes;

public class IntCode {

	private int[] prog;
	private int input;
	private int output;

	private final static int OPCODE_ADD = 1;
	private final static int OPCODE_MUL = 2;
	private final static int OPCODE_IN = 3;
	private final static int OPCODE_OUT = 4;
	private final static int OPCODE_JIT = 5;
	private final static int OPCODE_JIF = 6;
	private final static int OPCODE_LT = 7;
	private final static int OPCODE_EQ = 8;
	private final static int OPCODE_END = 99;

	private final static int MODE_POSITION = 0;

	public IntCode(int[] program) {
		prog = program;
	}

	public IntCode(int[] program, int input) {
		prog = program;
		this.input = input;
	}

	public int run() {
		int i = 0, opcode = prog[i] % 100;
		while (opcode != OPCODE_END) {
			var indices = getIndices(prog[i], i);
			switch (opcode) {
			case OPCODE_ADD -> prog[indices[2]] = prog[indices[1]] + prog[indices[0]];
			case OPCODE_MUL -> prog[indices[2]] = prog[indices[1]] * prog[indices[0]];
			case OPCODE_IN -> prog[indices[0]] = input;
			case OPCODE_OUT -> setOutput(prog[indices[0]]);
			case OPCODE_JIT -> i = (prog[indices[0]] != 0) ? prog[indices[1]] : i + 3;
			case OPCODE_JIF -> i = (prog[indices[0]] == 0) ? prog[indices[1]] : i + 3;
			case OPCODE_LT -> prog[indices[2]] = (prog[indices[0]] < prog[indices[1]]) ? 1 : 0;
			case OPCODE_EQ -> prog[indices[2]] = (prog[indices[0]] == prog[indices[1]]) ? 1 : 0;
			}
			if (opcode < OPCODE_IN || opcode > OPCODE_JIF) {
				i += 4;
			} else if (opcode == OPCODE_IN || opcode == OPCODE_OUT) {
				i += 2;
			}
			opcode = prog[i] % 100;
		}
		return prog[0];
	}

	private int[] getIndices(int opcode, int i) {
		int[] indices = new int[3];
		int[] parameters = getParameters(opcode, i);
		indices[0] = getValue(parameters[0], i + 1);
		indices[1] = getValue(parameters[1], i + 2);
		indices[2] = getValue(parameters[2], i + 3);
		return indices;
	}

	private int[] getParameters(int opcode, int i) {
		int[] parameters = new int[3];
		parameters[0] = opcode / 100 % 10;
		parameters[1] = opcode / 1000 % 10;
		parameters[2] = opcode / 10000;
		return parameters;
	}

	private int getValue(int mode, int i) {
		if (mode == MODE_POSITION) {
			return prog[i];
		}
		return i;
	}

	public int getOutput() {
		return output;
	}

	private int setOutput(int output) {
		this.output = output;
		return output;
	}
}
