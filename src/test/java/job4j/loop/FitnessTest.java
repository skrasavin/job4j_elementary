package job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FitnessTest {
    @Test
    public void whenIvanGreatNik() {
        int month = Fitness.calc(95, 90);
        assertThat(month, is(0));
    }

    @Test
    public void whenIvanLessByOneNik() {
        int month = Fitness.calc(90, 95);
        assertThat(month, is(1));
    }

    @Test
    public void whenIvanLessByFewNik() {
        int month = Fitness.calc(50, 90);
        assertThat(month, is(2));
    }

    @Test
    public void whenIvanLessByFourNik() {
        int month = Fitness.calc(20, 70);
        assertThat(month, is(4));
    }

    @Test
    public void whenIvanLessByOne1Nik() {
        int month = Fitness.calc(90, 90);
        assertThat(month, is(1));
    }
}