package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.tc_009Page;

import static org.junit.Assert.assertTrue;

public class tc_009Steps {
    WebDriver driver;
    tc_009Page page;

    @Given("el usuario tiene un archivo Excel abierto")
    public void el_usuario_tiene_un_archivo_Excel_abierto() {
        // Código para verificar que el archivo Excel está abierto.
        page = new tc_009Page(driver);
    }

    @When("localiza el campo 'Ramo' en el Excel")
    public void localiza_el_campo_Ramo_en_el_Excel() {
        assertTrue(page.isRamoFieldVisible());
    }

    @Then("el campo 'Ramo' es visible")
    public void el_campo_Ramo_es_visible() {
        assertTrue(page.isRamoFieldVisible());
    }

    @Then("se inserta a la derecha de 'Ramo' la columna 'Folio Pre solicitud' sin datos")
    public void se_inserta_columna_Folio_Pre_solicitud() {
        assertTrue(page.isFolioPreSolicitudInsertedCorrectly() && page.isFolioPreSolicitudColumnEmpty());
    }
}