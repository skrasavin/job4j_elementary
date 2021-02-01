package job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenSumNumbersFromNullToTenThenFiftyFive() {
        int rsl = Counter.sum(0, 10);
        int expected = 55;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumNumbersFromOneToFiveThenFifteen() {
        int rsl = Counter.sum(1, 5);
        int expected = 15;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumNumbersFromThreeToEightThenThirtyThree() {
        int rsl = Counter.sum(3, 8);
        int expected = 33;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromOneToTenThenEighteen() {
        int rsl = Counter.sumByEven(3, 8);
        int expected = 18;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromOneToOneThenNull() {
        int rsl = Counter.sumByEven(1, 1);
        int expected = 0;
        assertThat(rsl, is(expected));
    }
}