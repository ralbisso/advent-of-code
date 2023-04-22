package aoc;

import static utils.FileUtils.getLine;

import java.text.ParseException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import enums.Day;

public class Day12 extends AoC2015 {

    private final Day day = Day.DAY_12;
    private final JSONArray input = getJSONArray(getLine(year, day));

    public int solvePart1() {
        return getSum(input);
    }

    public int solvePart2() {
        return getSum(input, "red");
    }

    private JSONArray getJSONArray(String input) {
        try {
            return (JSONArray) new JSONParser().parse(input);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    private int getSum(JSONArray jsonArray) {
        return getSum(jsonArray, null);
    }

    private int getSum(JSONArray jsonArray, String filter) {
        int sum = 0;
        for (Object item : jsonArray.toArray()) {
            sum += getSum(item, filter);
        }
        return sum;
    }

    private int getSum(JSONObject jsonObject, String filter) {
        int sum = 0;
        for (Object value : jsonObject.values()) {
            if (filter != null && filter.equals(value)) {
                return 0;
            }
            sum += getSum(value, filter);
        }
        return sum;
    }

    private int getSum(Object o, String filter) {
        if (o instanceof JSONObject) {
            return getSum((JSONObject) o, filter);
        } else if (o instanceof JSONArray) {
            return getSum((JSONArray) o, filter);
        } else if (o instanceof Long) {
            return ((Long) o).intValue();
        }
        return 0;
    }
}
