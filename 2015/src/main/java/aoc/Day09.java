package aoc;

import static classes.Split.SPACE;
import static enums.Day.DAY_09;
import static utils.FileUtils.getAllLines;
import static utils.PermutationUtils.getNextPermutation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import classes.permutable.Location;

public class Day09 extends AoC2015 {

	private final List<String> input = getAllLines(DAY_09);

	public int solvePart1() {
		var locations = getLocations();
		int min = getDistance(locations);
		while (getNextPermutation(locations)) {
			int distance = getDistance(locations);
			if (distance < min) {
				min = distance;
			}
		}
		return min;
	}

	public int solvePart2() {
		var locations = getLocations();
		int max = getDistance(locations);
		while (getNextPermutation(locations)) {
			int distance = getDistance(locations);
			if (distance > max) {
				max = distance;
			}
		}
		return max;
	}

	private Location[] getLocations() {
		var mapping = getMapping();
		var locations = new Location[mapping.size()];
		int index = 0;
		for (var entry : mapping.entrySet()) {
			locations[index++] = new Location(entry);
		}
		return locations;
	}

	private Map<String, Map<String, Integer>> getMapping() {
		Map<String, Map<String, Integer>> mapping = new TreeMap<>();
		for (var route : input) {
			var split = route.split(SPACE);
			String origin = split[0], destination = split[2];
			int distance = Integer.parseInt(split[4]);
			mapping.putIfAbsent(origin, new HashMap<>());
			mapping.get(origin).put(destination, distance);
			mapping.putIfAbsent(destination, new HashMap<>());
			mapping.get(destination).put(origin, distance);
		}
		return mapping;
	}

	private int getDistance(Location[] route) {
		int distance = 0;
		for (int i = 0; i < route.length - 1; i++) {
			Location origin = route[i], destination = route[i + 1];
			distance += origin.getDistances().get(destination.getName());
		}
		return distance;
	}
}
