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
public class InvalidSudokuException extends RuntimeException {

    public InvalidSudokuException() {
        super();
    }

    public InvalidSudokuException(String message) {
        super(message);
    }

    public InvalidSudokuException(Throwable cause) {
        super(cause);
    }

    public InvalidSudokuException(String message, Throwable cause) {
        super(message, cause);
    }
}
