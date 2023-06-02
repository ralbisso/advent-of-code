package classes.permutable;

import java.util.Map;
import java.util.Map.Entry;

public abstract class PermutableItem implements Comparable<PermutableItem> {

	protected String name;
	protected Map<String, Integer> parameters;

	protected PermutableItem(Entry<String, Map<String, Integer>> entry) {
		this.name = entry.getKey();
		this.parameters = entry.getValue();
	}

	public String getName() {
		return name;
	}

	public Map<String, Integer> getParameters() {
		return parameters;
	}

	@Override
	public int compareTo(PermutableItem other) {
		return name.compareTo(other.name);
	}

	@Override
	public String toString() {
		return name + " " + parameters;
	}
}
