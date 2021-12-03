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
        Cell cell = figure.position();
        assertThat(cell, is(Cell.C8));
    }

    @Test
    public void copy() {
        Figure figure = new BishopBlack(Cell.G4);
        assertThat(figure.copy(Cell.G4).position(), is(Cell.G4));
    }

    @Test
    public void way() {
        Figure figure = new BishopBlack(Cell.C8);
        Cell[] way = figure.way(Cell.G4);
        assertThat(way,
                is(new Cell[] {Cell.D7, Cell.E6, Cell.F5, Cell.G4}));
    }
}
