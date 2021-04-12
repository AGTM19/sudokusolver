/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solver;

/**
 *
 * @author Bayram
 */
public interface DokuCell extends Solving {

    /**
     * Sets this cell to a INITIAL, HOT, SAFE cell with a given value. Discards all other possible Values.
     *
     * @param value The value this Cell shall have.
     * @see CellState.State
     * @see CellState.Temperature
     * @see CellState.Integrity
     */
    public void setToInitialCell(int value);

    public void discardValue(int value) throws InvalidSudokuException;

    /**
     * Guesses a new value from the left possible values. Will not repeat once guessed values. Will take care of
     * CellState.
     *
     * @throws NoValueLeftException if there is no value left to guess
     */
    public void guessValue() throws NoValueLeftException;

    public void notifyDependingContainer();

    /**
     * Returns the value of the DokuCell if already determined.
     *
     * @return the value of this DokuCell
     */
    public int getValue();

    public Coordinates getCoordinates();

    /**
     * Only for sonding purpose.
     *
     * @return Copy of CellState
     */
    public SolvingState getCellState();

    public ValidityMessage isValuePossible(int value);

    public void refreshState();
}
