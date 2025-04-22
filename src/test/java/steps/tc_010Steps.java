package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_010Page;

public class tc_010Steps {
    tc_010Page columnPage = new tc_010Page();

    @Given("el usuario está en la página de tabla de datos")
    public void el_usuario_está_en_la_página_de_tabla_de_datos() {
        columnPage.navigateToPage();
    }

    @When("el usuario verifica la existencia de la columna 'Folio de Pago'")
    public void el_usuario_verifica_la_existencia_de_la_columna_folio_de_pago() {
        columnPage.checkColumns();
    }

    @Then("la columna 'Folio de Pago' debería aparecer inmediatamente a la derecha de 'Folio Pre solicitud'")
    public void la_columna_folio_de_pago_debería_aparecer_inmediatamente_a_la_derecha_de_folio_pre_solicitud() {
        Assert.assertTrue(columnPage.isFolioDePagoToRightOfFolioPreSolicitud());
    }

    @Then("la columna 'Folio de Pago' debería estar vacía")
    public void la_columna_folio_de_pago_debería_estar_vacía() {
        Assert.assertTrue(columnPage.isFolioDePagoColumnEmpty());
    }
}