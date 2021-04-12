/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import solver.Doku;
import solver.DokuCell;
import solver.DokuContainer;

/**
 *
 * @author Bayram
 */
public class Cell implements DokuCell {

    private final Map<Integer, Boolean> possibleValues;

    public Cell(Doku doku, List<DokuContainer> depindingContainer) {
        this.possibleValues = new HashMap<>();
        initCell();
    }

    private void initCell() {

    }
}
