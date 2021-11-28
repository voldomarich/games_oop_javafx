package ru.job4j.puzzle;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.OccupiedCellException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class LogicTest {

    @Test(expected = ImpossibleMoveException.class)
    public void move() {
        Logic.move(Cell.C8, Cell.E2);
    }

    @Test(expected = FigureNotFoundException.class)
    public void move() {
        Logic.findBy(Cell.E2);
    }

    @Test(expected = OccupiedCellException.class)
    public void move() {
        figures[Cell.F1].free;
        Cell cell = new Cell;
        cell.position() = Cell.F1;
        Logic.free(figure, cell);
    }
}
