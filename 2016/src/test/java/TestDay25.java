package aoc2016;

import org.junit.Assert;
import org.junit.Test;

public class TestDay25 {

    private final Day25 day = new Day25();

    @Test
    public void test() {
        Assert.assertEquals(Solutions2016.DAY25, day.solve());
    }
}
