package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ChessBoardTest {
    @Test
    public void wayIs5() {
        int way = ChessBoard.way(6, 7, 0, 1);
        assertThat(way, is(6));
    }

    @Test
    public void wayIs7() {
        int way = ChessBoard.way(7, 0, 4, 3);
        assertThat(way, is(3));
    }

    @Test
    public void wayIs0() {
        int way = ChessBoard.way(2, 6, 5, 3);
        assertThat(way, is(3));
    }
}