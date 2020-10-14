package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
       int in = 5;
       int expected = 120;
       int rsl = Factorial.calc(in);
       assertThat(rsl, is(expected));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int in = 8;
        int expected = 40320;
        int rsl = Factorial.calc(in);
        assertThat(rsl, is(expected));
    }
}