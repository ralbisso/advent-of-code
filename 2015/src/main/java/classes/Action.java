package aoc2015.classes;

public class Action {

    private final String action;
    private final int[] begin;
    private final int[] end;

    public Action(String instruction) {
        String[] split = instruction.split(" ");
        if ("turn".equals(split[0])) {
            this.action = "turn " + split[1];
            this.begin = getCoordinates(split[2]);
            this.end = getCoordinates(split[4]);
        } else {
            this.action = "toggle";
            this.begin = getCoordinates(split[1]);
            this.end = getCoordinates(split[3]);
        }
    }

    private int[] getCoordinates(String coordinates) {
        String[] split = coordinates.split(",");
        return new int[] { Integer.parseInt(split[0]), Integer.parseInt(split[1]) };
    }

    public String getAction() {
        return action;
    }

    public int[] getBegin() {
        return begin;
    }

    public int[] getEnd() {
        return end;
    }
}
