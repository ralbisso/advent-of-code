package aoc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestDay25 {

    private final Day25 day = new Day25();

    @Test
    public void test() {
        assertEquals(Solutions2018.DAY25, day.solve());
    }
}
