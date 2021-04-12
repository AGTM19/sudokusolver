/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokusolver;

import itb.xls.ITBcell;
import itb.xls.ITBsheet;
import itb.xls.ITBxls;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Bayram
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (ITBxls xls = new ITBxls(new File("C:\\...\\WoAuchImmerDieExcelLiegenSoll"))) {
            ITBsheet sheet = xls.getSheet(0);
            for (int row = 0; row < 9; row++) {
                for (int column = 0; column < 9; column++) {
                    ITBcell cell = sheet.getCell(column, row);
                    int value = (int) cell.getNumericValue(); // wir casten den Wert zu einem Integer, weil das ohnehin einer sein muss.
                }
            }
        } catch (IOException ex) {
            System.out.println("Fehler beim Öffnen der Excel.");
        }
    }

}
