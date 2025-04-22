package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_011Page;

public class tc_011Steps {

    private tc_011Page page;

    public tc_011Steps() {
        page = new tc_011Page();
    }

    @Given("estoy en la hoja de Excel")
    public void estoyEnLaHojaDeExcel() {
        page.navigateToExcelSheet();
    }

    @When("ubico la columna 'Fecha de Pago'")
    public void ubicoLaColumnaFechaDePago() {
        Assert.assertTrue("La columna 'Fecha de Pago' no es visible", page.isFechaDePagoColumnVisible());
    }

    @Then("la columna 'Fecha de Pago' es visible")
    public void laColumnaFechaDePagoEsVisible() {
        Assert.assertTrue("La columna 'Fecha de Pago' sigue sin ser visible", page.isFechaDePagoColumnVisible());
    }

    @Then("confirmo que a la derecha de 'Fecha de Pago' está la columna 'Status Pago Código'")
    public void confirmoQueADerechaEstaColumnaStatusPagoCodigo() {
        Assert.assertTrue("La columna 'Status Pago Código' no está en la posición correcta", page.isStatusPagoCodigoColumnAtRightPosition());
    }

    @Then("la columna 'Status Pago Código' está vacía")
    public void laColumnaStatusPagoCodigoEstaVacia() {
        Assert.assertTrue("La columna 'Status Pago Código' no está vacía", page.isStatusPagoCodigoColumnEmpty());
    }
}