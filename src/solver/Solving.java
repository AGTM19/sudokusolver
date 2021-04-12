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
public interface Solving {

    public SolvingState getState();

    /**
     * Checks if there is only one valid value left and refreshes the state of the cell if so. Does integrity check on
     * the left value.
     *
     * @see CellState.Integrity
     */
    public void refreshState();

    /**
     * If CellState.Integrity is HOT, it will notify all governing DokuContainers to inform them about new Value.
     *
     * @see DokuContainer
     */
    public void coolDown() throws InvalidSudokuException;
}
