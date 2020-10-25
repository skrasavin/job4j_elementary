package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax6To7Then7() {
        int result = Max.max(6, 7);
        assertThat(result, is(7));
    }

    @Test
    public void whenMax10To2Then10() {
        int result = Max.max(10, 2);
        assertThat(result, is(10));
    }

    @Test
    public void whenMax5To1Then5() {
        int result = Max.max(5, 1);
        assertThat(result, is(5));
    }

    @Test
    public void whenMaxFrom516Then5() {
        int result = Max.max(5, 1, 6);
        assertThat(result, is(6));
    }

    @Test
    public void whenMax5From274Then5() {
        int result = Max.max(2, 7, 4);
        assertThat(result, is(7));
    }

    @Test
    public void whenMax5To151749Then5() {
        int result = Max.max(15, 17, 4, 9);
        assertThat(result, is(17));
    }

    @Test
    public void whenMax5To22117916Then5() {
        int result = Max.max(22, 11, 79, 16);
        assertThat(result, is(79));
    }
}