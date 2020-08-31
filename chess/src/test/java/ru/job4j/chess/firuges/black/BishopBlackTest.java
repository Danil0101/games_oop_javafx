package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void positionTests() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell expected = Cell.C1;
        Cell actual = bishopBlack.position();
        assertEquals(expected, actual);
    }

    @Test
    public void copyTests() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell expected = Cell.G5;
        Cell actual = bishopBlack.copy(Cell.G5).position();
        assertEquals(expected, actual);
    }

    @Test
    public void wayTests() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell [] expected = new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Cell [] actual = bishopBlack.way(bishopBlack.position(), Cell.G5);
        assertArrayEquals(expected, actual);
    }

    @Test(expected = IllegalStateException.class)
    public void wayIllegalStateExceptionTests() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        bishopBlack.way(bishopBlack.position(), Cell.C2);
    }
}