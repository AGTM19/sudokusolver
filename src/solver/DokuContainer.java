/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solver;

import java.util.Map;
import java.util.Set;

/**
 *
 * @author Bayram
 */
public interface DokuContainer {

    public Set<DokuCell> getCells();

    /**
     * Notifies all (interested) Cells to discard given values.
     *
     * @param value value to be discarded in contained Cells.
     */
    public void notifyCells(int value);

    /**
     * Gives all valid
     *
     * @return
     */
    public Map<Integer, SolvingState.Integrity> getValues();

    public ValidityMessage isValuePossibleInOtherCellsThan(int value, DokuCell cell);

    public void coolDown();
}
