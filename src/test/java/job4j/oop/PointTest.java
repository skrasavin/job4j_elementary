package job4j.oop;

import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void distance3d() {
        Point p1 = new Point(1, 2, 3);
        Point p2 = new Point(5, 6, 7);
        double res = p1.distance3d(p2);
        assertThat(res, closeTo(6.93, 0.01));
    }

    @Test
    public void distance3d2() {
        Point p1 = new Point(2, 9, 7);
        Point p2 = new Point(4, 7, 8);
        double res = p1.distance3d(p2);
        assertThat(res, closeTo(3.0, 0.01));
    }
}