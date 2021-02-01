package job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort2() {
        int[] input = new int[] {20, 1, 15, 4};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 4, 15, 20};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort3() {
        int[] input = new int[] {8, 0, 1, 4, 2, 3, 6, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {0, 1, 2, 3, 4, 5, 6, 8};
        assertThat(result, is(expect));
    }
}