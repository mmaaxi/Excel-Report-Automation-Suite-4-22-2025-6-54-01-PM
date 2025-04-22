package pages;

import org.openqa.selenium.WebDriver;

public class tc_002Page {
    WebDriver driver;

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openExcelFile() {
        // Código para abrir el archivo Excel exportado
    }

    public void locateColumnC() {
        // Código para ubicar la columna C
    }

    public void verifyColumnCDataVisibility() {
        // Código para verificar que la columna C sea visible y contenga datos
    }

    public void selectRow(int rowIndex) {
        // Código para seleccionar la fila especificada (e.g., fila 2)
    }

    public void checkCellFormula() {
        // Código para revisar que la celda contenga la fórmula =CONCATENATE(D2, '_', H2, '_', U2, '_', O2, '_', E2)
    }

    public void verifyCorrectConcatenation() {
        // Código para verificar que la celda muestra la concatenación correcta
    }
}