package job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = turner.back(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {1, 2, 3, 4, 5};
        int[] result = turner.back(input);
        int[] expect = new int[] {5, 4, 3, 2, 1};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray1() {
        Turn turner = new Turn();
        int[] input = new int[] {1, 2, 4, 5, 7, 9};
        int[] result = turner.back(input);
        int[] expect = new int[] {9, 7, 5, 4, 2, 1};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray1() {
        Turn turner = new Turn();
        int[] input = new int[] {2, 0, 9, 1, 7, 5, 2, 2, 8, 9, 2};
        int[] result = turner.back(input);
        int[] expect = new int[] {2, 9, 8, 2, 2, 5, 7, 1, 9, 0, 2};
        assertThat(result, is(expect));
    }
}