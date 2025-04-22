package steps;

import pages.tc_012Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class tc_012Steps {

    tc_012Page page = new tc_012Page();

    @Given("La columna 'Status de Pago' es identificada en el Excel")
    public void identificarColumnaStatusDePago() {
        Assert.assertTrue(page.isStatusDePagoColumnPresent());
    }

    @When("El encabezado es renombrado a 'Descripción Status Pago'")
    public void renombrarEncabezado() {
        page.renameStatusDePagoColumn();
    }

    @Then("El encabezado se muestra como 'Descripción Status Pago' manteniendo el contenido original.")
    public void verificarEncabezadoRenombrado() {
        Assert.assertTrue(page.isRenamedHeaderCorrect() && page.isOriginalContentIntact());
    }
}