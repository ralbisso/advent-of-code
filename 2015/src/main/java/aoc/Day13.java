package aoc;

import static classes.Split.SPACE;
import static enums.Day.DAY_13;
import static utils.FileUtils.getAllLines;
import static utils.PermutationUtils.getNextPermutation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import classes.permutable.Guest;

public class Day13 extends AoC2015 {

	private final List<String> input = getAllLines(DAY_13);

	private final static String GAIN = "gain";
	private final static String ME = "Me";

	public int solvePart1() {
		var table = getGuests(false);
		return getMaximumHappiness(table);
	}

	public int solvePart2() {
		var table = getGuests(true);
		return getMaximumHappiness(table);
	}

	private int getMaximumHappiness(Guest[] table) {
		int max = getTotalHappiness(table);
		while (getNextPermutation(table)) {
			int distance = getTotalHappiness(table);
			if (distance > max) {
				max = distance;
			}
		}
		return max;
	}

	private Guest[] getGuests(boolean includesMe) {
		var mapping = getMapping(includesMe);
		var guests = new Guest[mapping.size()];
		int index = 0;
		for (var entry : mapping.entrySet()) {
			guests[index++] = new Guest(entry);
		}
		return guests;
	}

	private Map<String, Map<String, Integer>> getMapping(boolean includesMe) {
		Map<String, Map<String, Integer>> mapping = new TreeMap<>();
		for (var change : input) {
			var split = change.split(SPACE);
			String guest = split[0], neighbour = split[10].replace(".", "");
			int units = Integer.parseInt(split[3]);
			mapping.putIfAbsent(guest, new HashMap<>());
			mapping.get(guest).put(neighbour, (split[2].equals(GAIN) ? units : -units));
			if (includesMe) {
				mapping.putIfAbsent(ME, new HashMap<>());
				mapping.get(guest).put(ME, 0);
				mapping.get(ME).put(guest, 0);
			}
		}
		return mapping;
	}

	private int getTotalHappiness(Guest[] table) {
		int happiness = 0, length = table.length;
		for (int i = 0; i < length; i++) {
			Guest guest = table[i];
			Guest left = table[(i + length - 1) % length];
			Guest right = table[(i + 1) % length];
			happiness += guest.getNeightbours().get(left.getName());
			happiness += guest.getNeightbours().get(right.getName());
		}
		return happiness;
	}
}
