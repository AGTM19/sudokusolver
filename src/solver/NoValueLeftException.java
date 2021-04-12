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
public class NoValueLeftException extends Exception {

    public NoValueLeftException() {
        super();
    }

    public NoValueLeftException(String message) {
        super(message);
    }

    public NoValueLeftException(Throwable cause) {
        super(cause);
    }

    public NoValueLeftException(String message, Throwable cause) {
        super(message, cause);
    }
}
