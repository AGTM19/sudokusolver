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
public class SolvingState implements Cloneable {

    private State state;
    private Temperature temperature;
    private Integrity integrity;

    public SolvingState(State state, Temperature temperature, Integrity integrity) {
        this.state = state;
        this.temperature = temperature;
        this.integrity = integrity;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        if (state == null) {
            throw new NullPointerException("State must not be null.");
        }
        this.state = state;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public Integrity getIntegrity() {
        return integrity;
    }

    public void setIntegrity(Integrity integrity) {
        if (integrity == null) {
            throw new NullPointerException("State must not be null.");
        }
        this.integrity = integrity;
    }

    /**
     * @throws CloneNotSupportedException Will not happen as Cloneable is implemented.
     */
    @Override
    public SolvingState clone() throws CloneNotSupportedException {
        super.clone(); // TODO: Check if Object.clone() will throw ConeNotSupportedException.
        return new SolvingState(state, temperature, integrity);
    }

    public enum Temperature {
        HOT,
        COLD;
    }

    public enum State {
        INITIAL,
        FINISHED,
        PROGRESS;
    }

    public enum Integrity {
        SAFE,
        GUESSED;
    }
}
