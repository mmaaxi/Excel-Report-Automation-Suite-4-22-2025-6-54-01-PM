package steps;

import pages.tc_007Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertTrue;

public class tc_007Steps {

    tc_007Page ivaPage = new tc_007Page();

    @Given("El usuario abre el documento Excel")
    public void elUsuarioAbreElDocumentoExcel() {
        ivaPage.openExcelDocument();
    }

    @When("Busca las columnas {string}, {string}, {string}")
    public void buscaLasColumnas(String column1, String column2, String column3) {
        ivaPage.searchColumns(column1, column2, column3);
    }

    @Then("Las tres columnas están presentes en las posiciones definidas")
    public void lasTresColumnasEstanPresentesEnLasPosicionesDefinidas() {
        assertTrue(ivaPage.areColumnsPresent());
    }

    @When("Valida que cada columna se llene con los montos correspondientes según la tasa de IVA")
    public void validaQueCadaColumnaSeLleneConLosMontos() {
        ivaPage.validateColumnAmounts();
    }

    @Then("Cada columna muestra los montos correctos o se mantiene vacía en caso de no aplicar")
    public void cadaColumnaMuestraLosMontosCorrectos() {
        assertTrue(ivaPage.areColumnAmountsCorrect());
    }
}