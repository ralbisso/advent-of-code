package aoc2015;

import static utils.FileUtils.getAllLines;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import utils.enums.Day;

public class Day07 extends AoC2015 {

    private final Day day = Day.DAY_07;
    private final List<String> input = getAllLines(year, day);

    private final static String SIGNAL_A = "a";
    private final static String SIGNAL_B = "b";
    private final static String AND = "AND";
    private final static String OR = "OR";
    private final static String LSHIFT = "LSHIFT";
    private final static String RSHIFT = "RSHIFT";

    public int solvePart1() {
        Map<String, Integer> circuit = new HashMap<>();

        while (circuit.size() < input.size()) {
            for (String wire : input) {
                String[] split = wire.split(" -> ");
                String in = split[0], out = split[1];
                if (!circuit.containsKey(out)) {
                    Integer signal = getSignal(in, circuit);
                    if (signal != null) {
                        if (SIGNAL_A.equals(out)) {
                            return signal;
                        }
                        circuit.put(out, signal);
                    }
                }
            }
        }
        return 0;
    }

    public int solvePart2() {
        Map<String, Integer> circuit = new HashMap<>();
        circuit.put(SIGNAL_B, 46065);
        while (circuit.size() < input.size()) {
            for (String wire : input) {
                String[] split = wire.split(" -> ");
                String in = split[0], out = split[1];
                if (!circuit.containsKey(out) && !SIGNAL_B.equals(out)) {
                    Integer signal = getSignal(in, circuit);
                    if (signal != null) {
                        if (SIGNAL_A.equals(out)) {
                            return signal;
                        }
                        circuit.put(out, signal);
                    }
                }
            }
        }
        return 0;
    }

    private Integer getSignal(String in, Map<String, Integer> circuit) {
        Integer signal = null;
        String[] split = in.split(" ");
        switch (split.length) {
        case 1 -> signal = getValue(split[0], circuit);
        case 2 -> {
            Integer wire = getValue(split[1], circuit);
            if (wire != null) {
                signal = ~wire;
            }
        }
        case 3 -> {
            Integer wire1 = getValue(split[0], circuit);
            Integer wire2 = getValue(split[2], circuit);
            if (wire1 != null && wire2 != null) {
                switch (split[1]) {
                case AND -> signal = wire1 & wire2;
                case OR -> signal = wire1 | wire2;
                case LSHIFT -> signal = wire1 << wire2;
                case RSHIFT -> signal = wire1 >> wire2;
                }
            }
        }
        }
        return signal;
    }

    private Integer getValue(String in, Map<String, Integer> circuit) {
        Integer value;
        try {
            value = Integer.parseInt(in);
        } catch (NumberFormatException nfe) {
            value = circuit.get(in);
        }
        return value;
    }
}
