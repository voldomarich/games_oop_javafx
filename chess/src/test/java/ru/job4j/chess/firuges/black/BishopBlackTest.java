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
        Figure figure = new BishopBlack(Cell.C8);
        new BishopBlack(Cell.C8).position();
        assertThat(new BishopBlack(Cell.C8), is("C8(2, 0)"));
    }

    @Test
    public void copy() {
        Figure figure = new BishopBlack(Cell.G5);
        new BishopBlack(Cell.C8).copy(Cell.G5);
        assertThat(new BishopBlack(Cell.C8), is("G5(6, 4)"));
    }

    @Test
    public void way() {
        Figure figure = new BishopBlack(Cell.C8);
        new BishopBlack(Cell.C8).way(Cell.G5);
        assertThat(new BishopBlack(Cell.C8),
                is("C8(2, 0), D7(3, 1), C8(2, 0)Cell.E3, Cell.F4, Cell.G5)"));
    }
}
