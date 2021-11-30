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
        assertThat(logic.move(Cell.C8, Cell.C7),
                is("Пользователь двигает фигуру не по правилам шахмат"));
    }

    @Test(expected = FigureNotFoundException.class)
    public void fnfe() throws FigureNotFoundException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C8));
        Cell rsl = logic.findBy(Cell.A2);
        assertThat(rsl, is("Фигуры нет на клетке"));
    }

    @Test(expected = OccupiedCellException.class)
    public void oce() {
        Logic logic = new Logic();
        logic.add(new PawnWhite(Cell.D7));
        boolean rsl = logic.free(new Cell[] {Cell.D7, Cell.E6, Cell.F5, Cell.G4});
        assertThat(rsl, is("Ячейка занята"));
    }
}
