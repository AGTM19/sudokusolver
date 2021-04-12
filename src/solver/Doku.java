package solver;

import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bayram
 */
public interface Doku {

    /**
     * Value will not change over time.
     *
     * @return the maximum valid value
     */
    public int getMaximumValue();

    /**
     * A snapshot of currently hot Elements. DokuCells implement Solbing, but also checks for container to be Solving.
     *
     * @return Cells to be cooled down
     */
    public Set<Solving> getHotElements();

    /**
     * Undeterministically guesses a value for one Cell with the least left possible values.
     */
    public void guessValue();

    public boolean isGuessed();

    public boolean isSolved();

    /**
     * Tries another value for last guessed Cell. If there is no value left, rewinds next Cell. (FILO)
     *
     * @throws solver.NoValueLeftException if all tries fail.
     */
    public void retryGuess() throws NoValueLeftException;
}
