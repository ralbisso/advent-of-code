package aoc2018;

import org.junit.Assert;
import org.junit.Test;

public class TestDay25 {

    private final Day25 day = new Day25();

    @Test
    public void test() {
        Assert.assertEquals(Solutions2018.DAY25, day.solve());
    }
}
