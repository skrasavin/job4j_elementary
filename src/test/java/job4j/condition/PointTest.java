/**
package job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        int expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when42to25then3() {
        int x1 = 4;
        int y1 = 2;
        int x2 = 2;
        int y2 = 5;
        double expected = 3.6;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when17to26then1() {
        int x1 = 1;
        int y1 = 7;
        int x2 = 2;
        int y2 = 6;
        double expected = 1.41;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1217to1622then6() {
        int x1 = 12;
        int y1 = 17;
        int x2 = 16;
        int y2 = 22;
        double expected = 6.4;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
*/