/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.IOException;
import solver.Doku;

/**
 *
 * @author Bayram
 */
public interface DokuSaver<T extends Doku> {

    public void saveDoku(T doku) throws IOException;
}
