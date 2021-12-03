package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.white.PawnWhite;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class LogicTest {

    @Test(expected = ImpossibleMoveException.class)
    public void ime() throws ImpossibleMoveException,
            OccupiedCellException, FigureNotFoundException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C8));
        logic.move(Cell.C8, Cell.C7);
    }

    @Test(expected = FigureNotFoundException.class)
    public void fnfe() throws FigureNotFoundException, OccupiedCellException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C8));
        logic.move(Cell.C1, Cell.E1);
    }

    @Test(expected = OccupiedCellException.class)
    public void oce() throws OccupiedCellException, FigureNotFoundException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C8));
        logic.add(new PawnWhite(Cell.D7));
        logic.move(Cell.C8, Cell.G4);
    }
}
