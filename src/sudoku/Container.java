/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.util.ArrayList;
import java.util.List;
import solver.DokuContainer;

/**
 *
 * @author Bayram
 */
public abstract class Container implements DokuContainer {

    protected final int index;
    protected final List<Cell> cells;

    public Container(int index) {
        this.index = index;
        this.cells = new ArrayList<>();
    }

    public abstract void autofillCells();

    public abstract void refreshSafeValues();

    public abstract Cell getCellAt(int indx);
}
