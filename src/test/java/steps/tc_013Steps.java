package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_013Page;
import static org.junit.Assert.assertTrue;

public class tc_013Steps {
    tc_013Page page = new tc_013Page();

    @Given("el usuario tiene acceso al documento Excel con la columna 'IVA Acumulado'")
    public void el_usuario_tiene_acceso_al_documento_Excel() {
        page.openDocument();
    }
    
    @When("el usuario localiza la columna 'IVA Acumulado'")
    public void el_usuario_localiza_la_columna_IVA_Acumulado() {
        page.locateIvaColumn();
    }

    @Then("la columna 'IVA Acumulado' se encuentra visible")
    public void la_columna_IVA_Acumulado_se_encuentra_visible() {
        assertTrue(page.isIvaColumnVisible());
    }
    
    @When("el usuario revisa la fórmula en la columna 'IVA Acumulado'")
    public void el_usuario_revisa_la_fórmula() {
        page.checkIvaFormula();
    }

    @Then("la fórmula muestra la suma correcta de los IVA 16%, IVA FRONTERIZO, IVA 0% y IVA EXENTO, excluyendo el IVA retenido")
    public void la_fórmula_muestra_la_suma_correcta() {
        assertTrue(page.isFormulaCorrect());
    }
}