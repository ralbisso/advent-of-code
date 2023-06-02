package classes.permutable;

import java.util.Map;
import java.util.Map.Entry;

public class Location extends PermutableItem {

	public Location(Entry<String, Map<String, Integer>> entry) {
		super(entry);
	}

	public Map<String, Integer> getDistances() {
		return parameters;
	}
}
