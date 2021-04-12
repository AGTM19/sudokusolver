/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solver;

import java.util.stream.Stream;

/**
 *
 * @author Bayram
 */
public class ValidityMessage {

    private final int value;
    private final boolean possible;
    private final SolvingState.Integrity integrity;

    public ValidityMessage(int value, boolean possible, SolvingState.Integrity integrity) {
        this.value = value;
        this.possible = possible;
        this.integrity = integrity;
    }

    public int getValue() {
        return value;
    }

    public boolean isPossible() {
        return possible;
    }

    public SolvingState.Integrity getIntegrity() {
        return integrity;
    }

    /**
     * Merges two Instances in a way, that its possibility will be true if at least one is true and its
     * CellState.Integrity is GUESSED if at least one instance is guessed.
     *
     * @param vMessage the instance to be merged with this instance. Has to have the same Value.
     * @return a new ValidityMessage containing the merged information
     *
     * @throws IllegalArgumentException if vMessage and this have different Values
     */
    public ValidityMessage merge(ValidityMessage vMessage) throws IllegalArgumentException {
        if (vMessage.getValue() != this.getValue()) {
            throw new IllegalArgumentException("Merging " + ValidityMessage.class.getName() + " must have the same Value.");
        }

        boolean mergedPossibility = vMessage.isPossible() || this.isPossible();
        SolvingState.Integrity mergedIntegrity = isAtLeastOneGuessed() ? SolvingState.Integrity.GUESSED : SolvingState.Integrity.SAFE;

        return new ValidityMessage(value, mergedPossibility, mergedIntegrity);
    }

    private static boolean isAtLeastOneGuessed(ValidityMessage... vMessages) {
        return Stream.of(vMessages)
                .anyMatch(vMessage -> vMessage.getIntegrity() == SolvingState.Integrity.GUESSED);
    }
}
