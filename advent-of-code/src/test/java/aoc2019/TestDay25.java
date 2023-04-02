package aoc2019;

import org.junit.Assert;
import org.junit.Test;

public class TestDay25 {

    private final Day25 day = new Day25();

    @Test
    public void test() {
        Assert.assertEquals(Solutions2019.DAY25, day.solve());
    }
}
