package aoc;

import static aoc.Solutions2019.DAY25;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestDay25 {

    private final Day25 day = new Day25();

    @Test
    public void test() {
        assertEquals(DAY25, day.solve());
    }
}
