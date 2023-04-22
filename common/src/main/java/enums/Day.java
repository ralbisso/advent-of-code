package enums;

public enum Day {
    
    DAY_01("day01"),
    DAY_02("day02"),
    DAY_03("day03"),
    DAY_04("day04"),
    DAY_05("day05"),
    DAY_06("day06"),
    DAY_07("day07"),
    DAY_08("day08"),
    DAY_09("day09"),
    DAY_10("day10"),
    DAY_11("day11"),
    DAY_12("day12"),
    DAY_13("day13"),
    DAY_14("day14"),
    DAY_15("day15"),
    DAY_16("day16"),
    DAY_17("day17"),
    DAY_18("day18"),
    DAY_19("day19"),
    DAY_20("day20"),
    DAY_21("day21"),
    DAY_22("day22"),
    DAY_23("day23"),
    DAY_24("day24"),
    DAY_25("day25");

    private String day;
    
    private Day(String day) {
        setDay(day);
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
