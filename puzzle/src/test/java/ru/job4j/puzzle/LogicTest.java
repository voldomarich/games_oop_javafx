package ru.job4j.puzzle;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class LogicTest {

    @Test
    public void add() {
    }

    @Test
    public void move() {
        Figure figure = new BishopBlack(Cell.C8);
        figure.move(Cell.C8, Cell.G4);
        assertThat(move(Cell.C8, Cell.G4),
                is(Cell.C8, Cell.G4));
    }

    @Test
    public void clean() {
    }
}
