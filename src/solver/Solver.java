/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solver;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Bayram
 */
public class Solver {

    private final Doku doku;
    private final Set<Solving> hotElements;

    public Solver(Doku doku) {
        this.doku = doku;
        this.hotElements = new HashSet<>();
    }

    public void solve() throws InvalidSudokuException {
        while (!doku.isSolved()) {
            refreshHotElements();
            solveWithoutGuess();
            if (!doku.isSolved()) {
                guessValue();
            }
        }
    }

    private void solveWithoutGuess() {
        try {
            recursivelyCoolDownElements();
        } catch (InvalidSudokuException e) {
            retryGuessIfPresent(e);
        }
    }

    private void recursivelyCoolDownElements() {
        while (!hotElements.isEmpty()) {
            hotElements.forEach(Solving::coolDown);
            refreshHotElements();
        }
    }

    private void retryGuessIfPresent(InvalidSudokuException e) {
        if (doku.isGuessed()) {
            retryGuess();
        } else {
            throw e;
        }
    }

    private void refreshHotElements() {
        hotElements.clear();
        hotElements.addAll(doku.getHotElements());
    }

    private void guessValue() {
        try {
            doku.guessValue();
        } catch (InvalidSudokuException ex) {
            retryGuess();
        }
    }

    private void retryGuess() {
        try {
            doku.retryGuess();
        } catch (NoValueLeftException e) {
            throw new InvalidSudokuException("Sudoku is not solveable in this state. Tryed every possibility", e);
        }
    }
}
