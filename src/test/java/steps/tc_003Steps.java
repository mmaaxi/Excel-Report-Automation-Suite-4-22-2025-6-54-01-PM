package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_003Page;

public class tc_003Steps {
    tc_003Page excelPage = new tc_003Page();

    @Given("el usuario abre el archivo Excel")
    public void elUsuarioAbreElArchivoExcel() {
        excelPage.openExcelFile();
    }

    @When("el usuario revisa los encabezados de las columnas")
    public void elUsuarioRevisaLosEncabezadosDeLasColumnas() {
        excelPage.loadColumnHeaders();
    }

    @Then("la columna 'Estado Código' se encuentra justo a la derecha de la columna 'i'")
    public void laColumnaEstadoCodigoSeEncuentra() {
        Assert.assertTrue(excelPage.isEstadoCodigoColumnInRightPosition());
    }

    @Then("la columna 'Estado Código' está en la posición exacta definida en el requerimiento")
    public void laColumnaEstadoCodigoEstaEnLaPosicionCorrecta() {
        Assert.assertTrue(excelPage.isEstadoCodigoColumnInExactPosition());
    }
}