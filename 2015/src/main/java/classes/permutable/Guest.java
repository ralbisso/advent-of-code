package classes.permutable;

import java.util.Map;
import java.util.Map.Entry;

public class Guest extends PermutableItem {

	public Guest(Entry<String, Map<String, Integer>> entry) {
		super(entry);
	}

	public Map<String, Integer> getNeightbours() {
		return parameters;
	}
}
