package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.tc_002Page;

public class tc_002Steps {
    WebDriver driver;
    tc_002Page page;

    @Given("el usuario abre el archivo Excel exportado")
    public void elUsuarioAbreElArchivoExcelExportado() {
        page = new tc_002Page(driver);
        page.openExcelFile();
    }

    @When("ubica la columna C")
    public void ubicaLaColumnaC() {
        page.locateColumnC();
    }

    @Then("la columna C es visible y contiene datos")
    public void laColumnaCEsVisibleYContieneDatos() {
        page.verifyColumnCDataVisibility();
    }

    @When("el usuario selecciona la fila 2")
    public void elUsuarioSeleccionaLaFila2() {
        page.selectRow(2);
    }

    @When("revisa que la celda contenga la fórmula correctamente")
    public void revisaQueLaCeldaContengaLaFormulaCorrectamente() {
        page.checkCellFormula();
    }

    @Then("la celda muestra la concatenación correcta de los valores")
    public void laCeldaMuestraLaConcatenacionCorrectaDeLosValores() {
        page.verifyCorrectConcatenation();
    }
}