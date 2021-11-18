package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class BishopBlackTest {

    @Test
    public void position() {
        Figure figure = new Figure();
        new Figure(figure).position();
        assertThat(figure().getPosition(), is("C8(2, 0)"));
    }

    @Test
    public void copy() {
        Figure figure = new Figure();
        Cell one = figure.copy(new Cell("test"));
        new Figure(figure).position();
        assertThat(figure().getPosition(), is("C8(2, 0)"));
    }
}
