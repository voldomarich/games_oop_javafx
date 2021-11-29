package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

public class LogicTest {

    @Test(expected = ImpossibleMoveException.class)
    public void ime() throws ImpossibleMoveException, OccupiedCellException, FigureNotFoundException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C8));
        logic.move(Cell.C8, Cell.E2);
    }

    @Test(expected = FigureNotFoundException.class)
    public void fnfe() throws FigureNotFoundException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C8));
        logic.findBy(Cell.A4);
    }

    @Test(expected = OccupiedCellException.class)
    public void oce() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C8));
        Cell cell = new Cell(Cell.F1);
        logic.free(logic, cell);
    }
}