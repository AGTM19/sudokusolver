/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.util.ArrayList;
import java.util.List;
import solver.Doku;

/**
 *
 * @author Bayram
 */
public class Sudoku implements Doku {

    private final List<Row> rows;
    private final List<Column> columns;
    private final List<Block> blocks;

    public Sudoku() {
        rows = new ArrayList<>();
        columns = new ArrayList<>();
        blocks = new ArrayList<>();
        initSudoku();
    }

    private void initSudoku() {
        for (int i = 0; i < 9; i++) {
            rows.add(new Row());
            columns.add(new Column());
            blocks.add(new Block());
        }
    }

    public void setNumberAt(int number, int column, int row) {

    }
}
